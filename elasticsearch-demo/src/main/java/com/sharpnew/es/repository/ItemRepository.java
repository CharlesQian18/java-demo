package com.sharpnew.es.repository;

import com.sharpnew.es.pojo.Item;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

/**
 * @description:
 * @program: demobase
 * @author: Charles
 * @created: 2020-08-25 17:10
 **/
public interface ItemRepository extends ElasticsearchRepository<Item, Long> {
  List<Item> findByPriceBetween(Double begin, Double end);
}
