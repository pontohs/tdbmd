package com.tdb.md.repository;

import java.util.List;

import com.tdb.md.model.Tdbmd;
import com.tdb.md.model.TdbmdKeyId;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface TdbmdRepository extends JpaRepository<Tdbmd, TdbmdKeyId>{
    
    //@Query("select mm from tdbmd mm where mm.user_id like %:uid% order by mm.module_order")
    public List<Tdbmd> findByUserId(@Param("uid") String uid);

    
}