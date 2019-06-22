package com.hls.dao;

import com.hls.beans.TestMyBatis;

import java.util.List;
import java.util.Map;

public interface Idao {
    void INSERTmember(TestMyBatis testMyBatis);
    void InsertMemberCache(TestMyBatis testMyBatis);

    void DeleteMemberByid(int id);
    void UpdateMember(TestMyBatis testMyBatis);

    List<TestMyBatis> selectAllMember();
    Map<String,Object> selectAllMemberMap();

    TestMyBatis selectMemberByName(String name);
    List<TestMyBatis> selectMemberBy(String sec);

}
