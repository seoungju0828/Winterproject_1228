package info.vo;

import java.util.*;

public class BookDAO {
	
	ArrayList<BookVO> booklist = new ArrayList<BookVO>();
	
	public void insert(BookVO dao) {
		booklist.add(dao);
	}
	
	public ArrayList<BookVO> select() {
		return booklist;
	}

}
