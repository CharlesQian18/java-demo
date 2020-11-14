package com.sharpnew.es.demo;

import com.sharpnew.es.pojo.Item;
import com.sharpnew.es.repository.ItemRepository;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.aggregations.AggregationBuilders;
import org.elasticsearch.search.aggregations.bucket.terms.Terms;
import org.elasticsearch.search.sort.SortBuilders;
import org.elasticsearch.search.sort.SortOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.data.elasticsearch.core.IndexOperations;
import org.springframework.data.elasticsearch.core.SearchHits;
import org.springframework.data.elasticsearch.core.query.FetchSourceFilter;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @program: demobase
 * @author: Charles
 * @created: 2020-08-25 16:19
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class EsTest {

  @Autowired
  private ElasticsearchRestTemplate template;

  @Autowired
  private ItemRepository repository;


  @Test
  public void test() {
    IndexOperations indexOps = template.indexOps(Item.class);
    //删除
    indexOps.delete();
    //创建
    indexOps.create();
    //映射关系
    indexOps.putMapping(indexOps.createMapping(Item.class));

//    template.deleteIndex(Item.class);
//    //创建索引
//    template.createIndex(Item.class);
//    //映射关系
//    template.putMapping(Item.class);
  }

  @Test
  public void indexList() {
    List<Item> list = new ArrayList<>();
    list.add(new Item(1L, "小米手机", "手机", "小米", 3299.00, "http://image.leyou.com/13123.jpg"));
    list.add(new Item(6L, "小米手机", "手机", "小米", 5299.00, "http://image.leyou.com/13123.jpg"));
    list.add(new Item(10L, "小米手机", "手机", "小米", 429.00, "http://image.leyou.com/13123.jpg"));
    list.add(new Item(2L, "坚果手机R1", "手机", "锤子", 3699.00, "http://image.leyou.com/13123.jpg"));
    list.add(new Item(3L, "华为META10", "手机", "华为", 4499.00, "http://image.leyou.com/13123.jpg"));
    list.add(new Item(4L, "小米Mix2S", "手机", "小米", 4299.00, "http://image.leyou.com/13123.jpg"));
    list.add(new Item(5L, "荣耀V10", "手机", "华为", 2799.00, "http://image.leyou.com/13123.jpg"));
    // 接收对象集合，实现批量新增
    // repository.saveAll(list);

    template.save(list);
  }

  @Test
  public void testFind() {
    Iterable<Item> all = repository.findAll();
    for (Item item : all) {
      System.out.println("item=" + item);
    }
  }

  @Test
  public void testFindBy() {
    List<Item> list = repository.findByPriceBetween(2000d, 4000d);
    for (Item item : list) {
      System.out.println("item=" + item);
    }
  }

  @Test
  public void testQuery() {
    //查询构建器
    NativeSearchQueryBuilder queryBuilder = new NativeSearchQueryBuilder();
    //结果过滤
    queryBuilder.withSourceFilter(new FetchSourceFilter(new String[]{"id", "title", "price"}, null));
    //添加过滤条件
    queryBuilder.withQuery(QueryBuilders.matchQuery("title", "小米手机"));
    //排序
    queryBuilder.withSort(SortBuilders.fieldSort("price").order(SortOrder.DESC));
    //分页
    queryBuilder.withPageable(PageRequest.of(0, 5));
//    SearchHits<Item> searchHits = template.search(queryBuilder.build(), Item.class);
//    List<Item> list = searchHits.stream().map(SearchHit::getContent).collect(Collectors.toList());
//    for (SearchHit<Item> hit : hits) {
//      System.out.println("hit=" + hit);
//    }
//    new PageImpl(list, , searchHits.getTotalHits());
    Page<Item> result = repository.search(queryBuilder.build());
    System.out.println("total:" + result.getTotalElements());
    System.out.println("totalPages:" + result.getTotalPages());

    for (Item item : result) {
      System.out.println("item=" + item);
    }
  }

  /**
   * 单层聚合
   */
  @Test
  public void testAgg() {
    NativeSearchQueryBuilder queryBuilder = new NativeSearchQueryBuilder();
    String aggName = "popularBrand";
    //聚合
    queryBuilder.addAggregation(AggregationBuilders.terms("popularBrand").field("brand.keyword"));

    SearchHits<Item> search = template.search(queryBuilder.build(), Item.class);

    //解析结果
    Terms terms = search.getAggregations().get(aggName);
    //获取桶
    List<? extends Terms.Bucket> buckets = terms.getBuckets();
    for (Terms.Bucket bucket : buckets) {
      System.out.println("bucket.getKeyAsString()" + bucket.getKeyAsString());
      System.out.println("bucket.getDocCount()" + bucket.getDocCount());
    }

  }
}
