package com.MyBatis.service;

import com.hls.beans.TestMyBatis;
import com.hls.dao.DaoImpl;
import com.hls.dao.Idao;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;
import java.util.List;

public class ServiceTest {
    private Idao idao;

    @Before
    public void before(){
        idao = new DaoImpl();
    }


    /*插入1.0*/
    @Test
    public void testInsert01(){
        String Time = new Date().toString();
        TestMyBatis ts = new TestMyBatis("黄乐枢kk1"+Time,"huangleshu2","男",Time);
        idao.INSERTmember(ts);
    }
    /*插入2.0  返回id*/
    @Test
    public void testInsert02(){
        String Time = new Date().toString();
        TestMyBatis ts = new TestMyBatis("黄乐枢kk1"+Time,"huangleshu2","男",Time);
        System.out.println(ts.getId());
        idao.InsertMemberCache(ts);
        System.out.println(ts.getId());
    }

    /*通过id删除*/
    @Test
    public void tese03(){
        idao.DeleteMemberByid(14);
    }

    //更新
    @Test
    public void test04() {
        TestMyBatis ts = new TestMyBatis("黄乐枢11","123456","男","2019-06-13");
        ts.setId(14);
        idao.UpdateMember(ts);
    }

    //
    @Test
    public void Test05(){
        List<TestMyBatis> ts = idao.selectAllMember();
        for (TestMyBatis temp:ts){
            temp.GetALL();
        }
    }
}

