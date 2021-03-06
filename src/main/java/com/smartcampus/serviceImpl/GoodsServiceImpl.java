package com.smartcampus.serviceImpl;

import com.smartcampus.dao.GoodsMapper;
import com.smartcampus.entity.Goods;
import com.smartcampus.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsMapper goodsMapper;

    public List<Goods> getAll(){
        return goodsMapper.findAll();
    }

    public Goods getById(Integer id){return goodsMapper.findById(id);}

    public void getUp(Integer id,String up){ goodsMapper.setUp(id,up);}

    public List<Goods> getAllById(String id) {
        return goodsMapper.findAllById(id);
    }

    public List<Goods> getHasUpById(String id) {
        return goodsMapper.findHasUpById(id);
    }

    public List<Goods> getHasDownById(String id) {
        return goodsMapper.findHasDownById(id);
    }

    public List<Goods> getHasOverById(String id) {
        return goodsMapper.findHasOverById(id);
    }

    public int delete(int id) {
        return goodsMapper.delete(id);
    }
}