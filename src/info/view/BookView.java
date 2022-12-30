package info.view;

import java.util.*;
import info.vo.BookVO;

public class BookView {
	
	public void view(ArrayList<BookVO> booklist) {
		
		for (BookVO bookVO : booklist) {
			System.out.println("[책 정보 출력]");
			System.out.println(" ");
			
			System.out.println("도서번호 : " + bookVO.getIsbn());
			System.out.println(" ");
			
			System.out.println("책 제목 : " + bookVO.getBookName());
			System.out.println(" ");
			
			System.out.println("출판사 : " + bookVO.getPublish());
			System.out.println(" ");
			
			System.out.println("작가 : " + bookVO.getAuthor());
			System.out.println(" ");
			
			System.out.println("가격 : " + bookVO.getPrice());
			System.out.println(" ");
			
			System.out.println("카테고리 : " + bookVO.getCategory());
			System.out.println(" ");
		}
		
	}

}
