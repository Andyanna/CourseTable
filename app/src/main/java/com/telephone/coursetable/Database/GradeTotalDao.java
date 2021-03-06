package com.telephone.coursetable.Database;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

@Dao
public interface GradeTotalDao {
    @Query("update GradeTotal set read=1")
    void readAll();

    @Query("select count(*) from GradeTotal where read=0")
    int unreadNum();

    @Query("select count(*) from GradeTotal")
    int totalNum();

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(GradeTotal tuple);

    @Query("select * from GradeTotal")
    List<GradeTotal> selectAll();
}
