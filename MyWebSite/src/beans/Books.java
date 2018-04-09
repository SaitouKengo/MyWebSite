package beans;




	public class Books {
		private int id;
		private String author;
		private String book_name;
		private int price;
		private String book_info;


		// 全てのデータをセットするコンストラクタ
		public Books(int id, String author, String book_name, int price, String book_info) {
			this.id = id;
			this.author = author;
			this.book_name = book_name;
			this.price = price;
			this.book_info = book_info;


		}


		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public String getAuthor() {
			return author;
		}


		public void setAuthor(String author) {
			this.author = author;
		}


		public String getBook_name() {
			return book_name;
		}


		public void setBook_name(String book_name) {
			this.book_name = book_name;
		}


		public int getPrice() {
			return price;
		}


		public void setPrice(int price) {
			this.price = price;
		}


		public String getBook_info() {
			return book_info;
		}


		public void setBook_info(String book_info) {
			this.book_info = book_info;
		}
	}


