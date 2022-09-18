
	   package com.dey.ui;
		import java.util.*;

		import com.dey.dao.BookDao;
		import com.dey.dao.BookJdbcDAO;
		import com.dey.db.BookDb;
		import com.dey.model.Book;
		public class AdminJdbc {

		public static void main(String args[]) {
			Scanner sc=new Scanner(System.in);
			//BookDao db=new BookDao();
			//BookDb database=new BookDb();
			String choice="y";
			while(choice.equals("y")) {
				System.out.println("menu");
				System.out.println("1 for display all books");
				System.out.println("2 for insert book");
				System.out.println("3 for delete book");
				System.out.println("4 for update");
				System.out.println("5 for find book by id");
				System.out.println("6 for exit");
				System.out.println("enter your choice: ");
				int n=sc.nextInt();
				BookJdbcDAO obj=new BookJdbcDAO();
				switch(n) {
				case 1:
					TreeSet<Book> b =obj.displayAll();
					obj.displayAll();
					System.out.println(b);
					break;
				case 2:
					System.out.println("enter id of book");
					int id=sc.nextInt();
					System.out.println("enter title of book");
					String title=sc.next();
					System.out.println("enter author of book");
					String author=sc.next();
					System.out.println("enter price of book");
					int price=sc.nextInt();
					Book obj1=new Book(id,title,author,price);
				obj.insertBook(obj1);
				    break;
				case 3:
					System.out.println("enter id of book");
					int id1=sc.nextInt();
					obj.deleteBook(id1);
							break;
				case 4:
					System.out.println("enter id of book");
					int id3=sc.nextInt();
					System.out.println("enter new price");
					int price1=sc.nextInt();
				obj.updateBook(id3, price1);
					break;
				case 5:
					System.out.println("enter id of book");
					int id4=sc.nextInt();
					obj.findById(id4);
					break;
				case 6:
					System.out.println("Thank you . Goodbye");
					obj.exit();
					break;
				}
				System.out.println("press y for menu");
				String str=sc.next();
				choice=str;
				
						
			}
			sc.close();
		}

		

	}


