package com.hp.dao.lxy;

import java.util.ArrayList;

import com.hp.entity.lxy.Book;
import com.hp.entity.lxy.User;

public interface BookDao {
  //全查
	ArrayList<Book> selectAll();
}
