package info.controller;

import java.util.Scanner;

import info.view.BookView;
import info.vo.BookDAO;
import info.vo.BookVO;
import java.util.ArrayList;

public class BookController {
	
	public final int CONTINUE = 1;
	public final int BREAK = 2;
	
	ArrayList<Integer> isbns = new ArrayList<Integer>();
	ArrayList<String> bookNames = new ArrayList<String>();
	ArrayList<String> publishs = new ArrayList<String>();
	ArrayList<String> authors = new ArrayList<String>();
	ArrayList<Integer> prices = new ArrayList<Integer>();
	ArrayList<String> categorys = new ArrayList<String>();
	
	public void ConsoleToList() {
		
		Scanner s1 = new Scanner(System.in);		//integer
		Scanner s2 = new Scanner(System.in);		//String
		
		int flag = CONTINUE;
		
		while (true) {
			if (flag == CONTINUE) {
				
				System.out.println("[책 정보 입력]");
				System.out.println(" ");
				
				System.out.print("도서번호 : ");
				isbns.add(s1.nextInt());
				System.out.println(" ");
				
				System.out.print("책 제목 : ");
				bookNames.add(s2.nextLine());
				System.out.println(" ");
				
				System.out.print("출판사 : ");
				publishs.add(s2.nextLine());
				System.out.println(" ");
				
				System.out.print("작가 : ");
				authors.add(s2.nextLine());
				System.out.println(" ");
				
				System.out.print("가격 : ");
				prices.add(s1.nextInt());
				System.out.println(" ");
				
				System.out.print("카테고리 : ");
				categorys.add(s2.nextLine());
				System.out.println(" ");
				
			} else if (flag == BREAK) {
				break;
			}
			System.out.println(" ");
			System.out.println("[더 많은 책 정보를 입력하시겠습니까?]");
			System.out.println(" ");
			System.out.println("입력 : 1 | 중단 : 2");
			System.out.print("선택 : ");
			flag = s1.nextInt();
		}
		
		s1.close();
		s2.close();
		
	}
	
	public void voToDAO (BookDAO dao) {
		
		for (int i=0; i<isbns.size(); i++) {
			BookVO booklist = new BookVO(isbns.get(i), bookNames.get(i), publishs.get(i), authors.get(i), prices.get(i), categorys.get(i));
			dao.insert(booklist);
		}
	}
	
	public static void main(String args[]) {
		// TODO Auto-generated method stub
		
		BookController controller = new BookController();
		
		controller.ConsoleToList();
		
		BookDAO dao = new BookDAO();
		controller.voToDAO(dao);
		
		BookView sview = new BookView();
		sview.view(dao.select());
	}

}
