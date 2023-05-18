package ModelCard;

import java.util.ArrayList;




public class CardFactory {
	public ArrayList<Card> originalCardList;
	public ArrayList<Card> originalPickedCardList;
	public Card hideCard;
	
	
	public ArrayList<Card> getOriginalCardList() {
		return originalCardList;
	}
	
	public void setOriginalCardList(ArrayList<Card> originalCardList) {
		this.originalCardList = originalCardList;
	}
	
	public ArrayList<Card> getOriginalPickedCardList() {
		return originalPickedCardList;
	}
	
	public void setOriginalPickedCardList(ArrayList<Card> originalPickedCardList) {
		this.originalPickedCardList = originalPickedCardList;
	}
	
	public Card getHideCard() {
		return hideCard;
	}
	
	public void setHideCard(Card hideCard) {
		this.hideCard = hideCard;
	}
	
	public void createOriginalCard() {
		originalCardList = new ArrayList<Card>();
		
		//lá bài bich
				originalCardList.add(new Card(0, "bich", "3", "images//3bich.gif"));
				originalCardList.add(new Card(1, "bich", "4", "images//4bich.gif"));
				originalCardList.add(new Card(2, "bich", "5", "images//5bich.gif"));
				originalCardList.add(new Card(3, "bich", "6", "images//6bich.gif"));
				originalCardList.add(new Card(4, "bich", "7", "images//7bich.gif"));
				originalCardList.add(new Card(5, "bich", "8", "images//8bich.gif"));
				originalCardList.add(new Card(6, "bich", "9", "images//9bich.gif"));
				originalCardList.add(new Card(7, "bich", "10", "images//10bich.gif"));
				originalCardList.add(new Card(8, "bich", "J", "images//11bich.gif"));
				originalCardList.add(new Card(9, "bich", "Q", "images//12bich.gif"));
				originalCardList.add(new Card(10, "bich", "K", "images//13bich.gif"));
				originalCardList.add(new Card(11, "bich", "A", "images//1bich.gif"));
				originalCardList.add(new Card(12, "bich", "2", "images//2bich.gif"));
				
				//lá bài chuồn
				originalCardList.add(new Card(13, "chuon", "3", "images//3chuon.gif"));
				originalCardList.add(new Card(14, "chuon", "4", "images//4chuon.gif"));
				originalCardList.add(new Card(15, "chuon", "5", "images//5chuon.gif"));
				originalCardList.add(new Card(16, "chuon", "6", "images//6chuon.gif"));
				originalCardList.add(new Card(17, "chuon", "7", "images//7chuon.gif"));
				originalCardList.add(new Card(18, "chuon", "8", "images//8chuon.gif"));
				originalCardList.add(new Card(19, "chuon", "9", "images//9chuon.gif"));
				originalCardList.add(new Card(20, "chuon", "10", "images//10chuon.gif"));
				originalCardList.add(new Card(21, "chuon", "J", "images//11chuon.gif"));
				originalCardList.add(new Card(22, "chuon", "Q", "images//12chuon.gif"));
				originalCardList.add(new Card(23, "chuon", "K", "images//13chuon.gif"));
				originalCardList.add(new Card(24, "chuon", "A", "images//1chuon.gif"));
				originalCardList.add(new Card(25, "chuon", "2", "images//2chuon.gif"));
				
//				lá bài ro
				originalCardList.add(new Card(26, "ro", "3", "images//3ro.gif"));
				originalCardList.add(new Card(27, "ro", "4", "images//4ro.gif"));
				originalCardList.add(new Card(28, "ro", "5", "images//5ro.gif"));
				originalCardList.add(new Card(29, "ro", "6", "images//6ro.gif"));
				originalCardList.add(new Card(30, "ro", "7", "images//7ro.gif"));
				originalCardList.add(new Card(31, "ro", "8", "images//8ro.gif"));
				originalCardList.add(new Card(32, "ro", "9", "images//9ro.gif"));
				originalCardList.add(new Card(33, "ro", "10", "images//10ro.gif"));
				originalCardList.add(new Card(34, "ro", "J", "images//11ro.gif"));
				originalCardList.add(new Card(35, "ro", "Q", "images//12ro.gif"));
				originalCardList.add(new Card(36, "ro", "K", "images//13ro.gif"));
				originalCardList.add(new Card(37, "ro", "A", "images//1ro.gif"));
				originalCardList.add(new Card(38, "ro", "2", "images//2ro.gif"));

//				lá bài cơ
				originalCardList.add(new Card(39, "co", "3", "images//3co.gif"));
				originalCardList.add(new Card(40, "co", "4", "images//4co.gif"));
				originalCardList.add(new Card(41, "co", "5", "images//5co.gif"));
				originalCardList.add(new Card(42, "co", "6", "images//6co.gif"));
				originalCardList.add(new Card(43, "co", "7", "images//7co.gif"));
				originalCardList.add(new Card(44, "co", "8", "images//8co.gif"));
				originalCardList.add(new Card(45, "co", "9", "images//9co.gif"));
				originalCardList.add(new Card(46, "co", "10", "images//10co.gif"));
				originalCardList.add(new Card(47, "co", "J", "images//11co.gif"));
				originalCardList.add(new Card(48, "co", "Q", "images/12co.gif"));
				originalCardList.add(new Card(49, "co", "K", "images//13co.gif"));
				originalCardList.add(new Card(50, "co", "A", "images//1co.gif"));
				originalCardList.add(new Card(51, "co", "2", "images//2co.gif"));
		
	}
	
	public void createPickedCard() {
		originalPickedCardList = new ArrayList<Card>();
		
//		chọn lá bích
		originalPickedCardList.add(new Card(0, "bich", "3", "images//3bichchon.jpg"));
		originalPickedCardList.add(new Card(1, "bich", "4", "images//4bichchon.jpg"));
		originalPickedCardList.add(new Card(2, "bich", "5", "images//5bichchon.jpg"));
		originalPickedCardList.add(new Card(3, "bich", "6", "images//6bichchon.jpg"));
		originalPickedCardList.add(new Card(4, "bich", "7", "images//7bichchon.jpg"));
		originalPickedCardList.add(new Card(5, "bich", "8", "images//8bichchon.jpg"));
		originalPickedCardList.add(new Card(6, "bich", "9", "images//9bichchon.jpg"));
		originalPickedCardList.add(new Card(7, "bich", "10", "images//10bichchon.jpg"));
		originalPickedCardList.add(new Card(8, "bich", "J", "images//11bichchon.jpg"));
		originalPickedCardList.add(new Card(9, "bich", "Q", "images//12bichchon.jpg"));
		originalPickedCardList.add(new Card(10, "bich", "K", "images//13bichchon.jpg"));
		originalPickedCardList.add(new Card(11, "bich", "A", "images//1bichchon.jpg"));
		originalPickedCardList.add(new Card(12, "bich", "2", "images//2bichchon.jpg"));
		
//		chọn lá chuồn
		originalPickedCardList.add(new Card(13, "chuon","3" , "images//3chuonchon.jpg"));
		originalPickedCardList.add(new Card(14, "chuon","4" , "images//4chuonchon.jpg"));
		originalPickedCardList.add(new Card(15, "chuon","5" , "images//5chuonchon.jpg"));
		originalPickedCardList.add(new Card(16, "chuon","6" , "images//6chuonchon.jpg"));
		originalPickedCardList.add(new Card(17, "chuon","7" , "images//7chuonchon.jpg"));
		originalPickedCardList.add(new Card(18, "chuon","8" , "images//8chuonchon.jpg"));
		originalPickedCardList.add(new Card(19, "chuon","9" , "images//9chuonchon.jpg"));
		originalPickedCardList.add(new Card(20, "chuon","10" , "images//10chuonchon.jpg"));
		originalPickedCardList.add(new Card(21, "chuon","J" , "images//11chuonchon.jpg"));
		originalPickedCardList.add(new Card(22, "chuon","Q" , "images//12chuonchon.jpg"));
		originalPickedCardList.add(new Card(23, "chuon","K" , "images//13chuonchon.jpg"));
		originalPickedCardList.add(new Card(24, "chuon","A" , "images//1chuonchon.jpg"));
		originalPickedCardList.add(new Card(25, "chuon","2" , "images//2chuonchon.jpg"));
		
//		chọn lá ro
		originalPickedCardList.add(new Card(26, "ro","3", "images//3rochon.jpg"));
		originalPickedCardList.add(new Card(27, "ro","4", "images//4rochon.jpg"));
		originalPickedCardList.add(new Card(28, "ro","5", "images//5rochon.jpg"));
		originalPickedCardList.add(new Card(29, "ro","6", "images//6rochon.jpg"));
		originalPickedCardList.add(new Card(30, "ro","7", "images//7rochon.jpg"));
		originalPickedCardList.add(new Card(31, "ro","8", "images//8rochon.jpg"));
		originalPickedCardList.add(new Card(32, "ro","9", "images//9rochon.jpg"));
		originalPickedCardList.add(new Card(33, "ro","10", "images//10rochon.jpg"));
		originalPickedCardList.add(new Card(34, "ro","J", "images//11rochon.jpg"));
		originalPickedCardList.add(new Card(35, "ro","Q", "images//12rochon.jpg"));
		originalPickedCardList.add(new Card(36, "ro","K", "images//13rochon.jpg"));
		originalPickedCardList.add(new Card(37, "ro","A", "images//1rochon.jpg"));
		originalPickedCardList.add(new Card(38, "ro","2", "images//2rochon.jpg"));
		
//		chọn lá cơ
		originalPickedCardList.add(new Card(39, "co", "3", "images//3cochon.jpg"));
		originalPickedCardList.add(new Card(40, "co", "4", "images//4cochon.jpg"));
		originalPickedCardList.add(new Card(41, "co", "5", "images//5cochon.jpg"));
		originalPickedCardList.add(new Card(42, "co", "6", "images//6cochon.jpg"));
		originalPickedCardList.add(new Card(43, "co", "7", "images//7cochon.jpg"));
		originalPickedCardList.add(new Card(44, "co", "8", "images//8cochon.jpg"));
		originalPickedCardList.add(new Card(45, "co", "9", "images//9cochon.jpg"));
		originalPickedCardList.add(new Card(46, "co", "10", "images//10cochon.jpg"));
		originalPickedCardList.add(new Card(47, "co", "J", "images//11cochon.jpg"));
		originalPickedCardList.add(new Card(48, "co", "Q", "images//12cochon.jpg"));
		originalPickedCardList.add(new Card(49, "co", "K", "images//13cochon.jpg"));
		originalPickedCardList.add(new Card(50, "co", "A", "images//1cochon.jpg"));
		originalPickedCardList.add(new Card(51, "co", "2", "images//2cochon.jpg"));

		
	}
	
	public void createHideCard() {
		hideCard = new Card(100, "hide", "hideside", "images//matsau.gif");
	}
	
	public static int whichCardIsBigger(Card card1, Card card2) {
		
		if (card1.equals(card2)) {
			return 100;
		}
		
		String pointOfCard1 = card1.getPoint();
		String pointOfCard2 = card2.getPoint();
		
		if (pointOfCard1.equals(pointOfCard2)) {
			String houseOfCard1 = card1.getHouse();
			String houseOfCard2 = card2.getHouse();
			
			if (houseOfCard1.equals("co")) {
				return 1;
			}
			
			if (houseOfCard2.equals("co")) {
				return 2;
			}
			
			if (houseOfCard1.equals("ro")) {
				return 1;
			}
			
			if (houseOfCard2.equals("ro")) {
				return 2;
			}
			
			if (houseOfCard1.equals("tep")) {
				return 1;
			}
			
			if (houseOfCard2.equals("tep")) {
				return 2;
			}
			
			if (houseOfCard1.equals("bich")) {
				return 1;
			}
			
			if (houseOfCard2.equals("bich")) {
				return 2;
			}
			
		} else {
			
			if (pointOfCard1.equals("2")) {
				return 1;
			}
			
			if (pointOfCard2.equals("2")) {
				return 2;
			}
			
			if (pointOfCard1.equals("A")) {
				return 1;
			}
			
			if (pointOfCard2.equals("A")) {
				return 2;
			}
			
			if (pointOfCard1.equals("K")) {
				return 1;
			}
			
			if (pointOfCard2.equals("K")) {
				return 2;
			}
			
			if (pointOfCard1.equals("Q")) {
				return 1;
			}
			
			if (pointOfCard2.equals("Q")) {
				return 2;
			}
			
			if (pointOfCard1.equals("J")) {
				return 1;
			}
			
			if (pointOfCard2.equals("J")) {
				return 2;
			}
			
			if (pointOfCard1.equals("10")) {
				return 1;
			}
			
			if (pointOfCard2.equals("10")) {
				return 2;
			}
			
			if (pointOfCard1.equals("9")) {
				return 1;
			}
			
			if (pointOfCard2.equals("9")) {
				return 2;
			}
			
			if (pointOfCard1.equals("8")) {
				return 1;
			}
			
			if (pointOfCard2.equals("8")) {
				return 2;
			}
			
			if (pointOfCard1.equals("7")) {
				return 1;
			}
			
			if (pointOfCard2.equals("7")) {
				return 2;
			}
			
			if (pointOfCard1.equals("6")) {
				return 1;
			}
			
			if (pointOfCard2.equals("6")) {
				return 2;
			}
			
			if (pointOfCard1.equals("5")) {
				return 1;
			}
			
			if (pointOfCard2.equals("5")) {
				return 2;
			}
			
			if (pointOfCard1.equals("4")) {
				return 1;
			}
			
			if (pointOfCard2.equals("4")) {
				return 2;
			}
			
			if (pointOfCard1.equals("3")) {
				return 1;
			}
			
			if (pointOfCard2.equals("3")) {
				return 2;
			}

		}
		
		return -1;
	}

	public static ArrayList<Card> sortDeck(ArrayList<Card> deck) {
		
		for (int i = 0; i < deck.size(); i++) {
			for (int j = 1; j < deck.size() - i; j++) {
				int kq = whichCardIsBigger(deck.get(j - 1), deck.get(j));
				if (kq == 1) {
					Card tempCard = deck.get(j - 1);
					deck.set(j -1, deck.get(j));
					deck.set(j, tempCard);
				}
			}
		}
		return (ArrayList<Card>) deck.clone();
	}
	
	public static int isComboCardBigger(ArrayList<Card> deckCombo, ArrayList<Card> deckComboTable) {
		
		ArrayList<Card> deckComboSorted = sortDeck(deckCombo);
		ArrayList<Card> deckComboTableSorted = sortDeck(deckComboTable);
		
		boolean isSanh = true;
		if (deckComboSorted.size() == 1) {
			isSanh = false;
		} else {
			for (int i = 0; i < deckComboSorted.size() - 1; i++) {
				if (deckComboSorted.get(i).getPoint().equals(deckComboSorted.get(i + 1).getPoint())) {
					// xám cô hoặc đôi thông
					isSanh = false;
					break;
				} else {
					// nếu không liên tiếp thì bài đánh lên không hợp lệ
					
					// không có sảnh 2 lá
					if (deckComboSorted.size() == 2) {
						return -1;
					}
					
					int pointOfCard1 = Integer.valueOf(deckComboSorted.get(i).getPoint());
					int pointOfCard2 = Integer.valueOf(deckComboSorted.get(i + 1).getPoint());
					
					if (pointOfCard2 != pointOfCard1 + 1) {
						// dã đến đây, tứ 100% là so sánh từ lá 2 - 3 trở lên
						// hay nói cách khác là lá đã có ít nhất lả 2 lá có điểm liên tiếp
						// nên nếu điều kiện này không thỏa thì đây là sam cô, tứ quý hoặc bộ bài không hợp lệ
						// ví dụ: 222. 567, 556, 5555
						// trước mắt thì đây không phải sảnh
						isSanh = false;
					}
				}
			}
		}
		
		// khi trên bàn chỉ có 1 lá bài
				if (deckComboTableSorted.size() == 1) {
					
					// nếu bài trên bàn chỉ có 1 lá thì các set có số lượng sau sẽ không được chấp nhận
					if (deckComboSorted.size() > 1 && (deckComboSorted.size() != 4 || deckComboSorted.size() != 6 
						|| deckComboSorted.size() != 8)) {
						return -1;
					}
					
					
					if (isSanh == false) {
						// chặt 1 heo bằng 3 đôi thông
						if (deckComboSorted.size() == 6 && deckComboSorted.get(0).getPoint().equals(deckComboSorted.get(1).getPoint()) 
							&& deckComboSorted.get(2).getPoint().equals(deckComboSorted.get(3).getPoint()) 
							&& deckComboSorted.get(4).getPoint().equals(deckComboSorted.get(5).getPoint())) {
							return 1;
						}
						
						// chặt 1 heo bằng 4 đôi thông
						if (deckComboSorted.size() == 8 && deckComboSorted.get(0).getPoint().equals(deckComboSorted.get(1).getPoint()) 
							&& deckComboSorted.get(2).getPoint().equals(deckComboSorted.get(3).getPoint()) 
							&& deckComboSorted.get(4).getPoint().equals(deckComboSorted.get(5).getPoint())
							&& deckComboSorted.get(6).getPoint().equals(deckComboSorted.get(7).getPoint())) {
							return 1;
						}
						
						// chặt 1 heo bằng tứ quý
						if (deckComboSorted.size() == 4 && deckComboSorted.get(0).getPoint().equals(deckComboSorted.get(1).getPoint())
							&& deckComboSorted.get(2).getPoint().equals(deckComboSorted.get(3).getPoint()) 
							&& deckComboSorted.get(0).getPoint().equals(deckComboSorted.get(3).getPoint())) {
							return 1;
				}
			}
						
					// đánh lá đơn, đã bao gồm trường hợp chặt heo đơn bằng heo đơn lớn hơn
					if (deckComboSorted.size() == 1) {
						int kq = whichCardIsBigger(deckComboSorted.get(0), deckComboTableSorted.get(0));
						if (kq == 1) {
							return 1;
				} 
			}
			
		}
		
				// khi trên bàn có 2 lá bài
				if (deckComboTableSorted.size() == 2) {
					
					// nếu bài đánh lên như vậy thì báo bài lỗi
					if (deckComboSorted.size() < 2 && deckComboSorted.size() != 4 && deckComboSorted.size() != 6) {
						return -1;
					}
					
					// nếu bài trên bàn là heo đôi
					if (deckComboTableSorted.get(0).getPoint().equals("2") && deckComboTableSorted.get(1).getPoint().equals("2")) {
						
						if (isSanh == false) {
							// chặt heo đôi bằng tứ quý
							if (deckComboSorted.size() == 4 && deckComboSorted.get(0).getPoint().equals(deckComboSorted.get(1).getPoint())
								&& deckComboSorted.get(2).getPoint().equals(deckComboSorted.get(3).getPoint()) 
								&& deckComboSorted.get(0).getPoint().equals(deckComboSorted.get(3).getPoint())) {
								return 1;
							}
							
							// chặt heo đôi bằng 4 đôi thông
							if (deckComboSorted.size() == 8 && deckComboSorted.get(0).getPoint().equals(deckComboSorted.get(1).getPoint()) 
								&& deckComboSorted.get(2).getPoint().equals(deckComboSorted.get(3).getPoint()) 
								&& deckComboSorted.get(4).getPoint().equals(deckComboSorted.get(5).getPoint())
								&& deckComboSorted.get(6).getPoint().equals(deckComboSorted.get(7).getPoint())) {
								return 1;
							}
							
							// chặt heo đôi bằng heo đôi lớn hơn
							if (deckComboSorted.size() == 2) {
								if (deckComboSorted.size() == 2 && deckComboSorted.get(0).getPoint().equals(deckComboSorted.get(1).getPoint())
									&& whichCardIsBigger(deckComboSorted.get(1), deckComboTableSorted.get(1)) == 1) {
									return 1;
						}
					}
				}
				
			}
			
					// nếu bài đánh trên bàn là 1 đôi thông
					if (deckComboTableSorted.get(0).getPoint().equals(deckComboTableSorted.get(1).getPoint())) {
						// thì đánh bằng 1 đôi thông lớn hơn
						if (isSanh == false) {
							if (deckComboSorted.size() == 2 
								&& deckComboSorted.get(0).getPoint().equals(deckComboSorted.get(1).getPoint())
								&& whichCardIsBigger(deckComboSorted.get(0), deckComboTableSorted.get(1)) == 1) {
								return 1;
					}
				}
			}
		}
		
				// khi trên bàn có 3 lá bài
				if (deckComboTableSorted.size() == 3) {
					// nếu 3 lá bài trên bàn là sám cô
					if (isSanh == false) {
						// dánh bằng sám cô lớn hơn
						if (deckComboSorted.size() == 3 && deckComboSorted.get(0).getPoint().equals(deckComboSorted.get(1).getPoint()) 
							&& deckComboSorted.get(1).getPoint().equals(deckComboSorted.get(2).getPoint())
							&& whichCardIsBigger(deckComboSorted.get(2), deckComboTableSorted.get(2)) == 1) {
							return 1;
						}
					} else {
						// đánh bằng sảnh lớn hơn
						if (deckComboSorted.size() == 3 && whichCardIsBigger(deckComboSorted.get(2), deckComboTableSorted.get(2)) == 1) {
							return 1;
						}
						
						// 3 heo thì không hàng nào chặt được
					}
				}
				
				// khi trên bàn có 4 lá bài
				if (deckComboTableSorted.size() == 4) {
					// nếu 4 lá bài trên bàn là tứ quý
					if (isSanh == false) {
						// đánh bằng tứ quý lớn hơn
						if (deckComboSorted.size() == 4 && deckComboSorted.get(0).getPoint().equals(deckComboSorted.get(1).getPoint()) 
							&& deckComboSorted.get(1).getPoint().equals(deckComboSorted.get(2).getPoint())
							&& deckComboSorted.get(2).getPoint().equals(deckComboSorted.get(3).getPoint())
							&& whichCardIsBigger(deckComboSorted.get(3), deckComboTableSorted.get(3)) == 1) {
							return 1;
						}
			}
			
					// nếu 4 lá bài là sảnh, đánh bằng sảnh lớn hơn
					if (deckComboSorted.size() == 4 && whichCardIsBigger(deckComboSorted.get(3), deckComboTableSorted.get(3)) == 1) {
						return 1;
					}
				}
				
				// khi trên bàn có 5 lá bài
				if (deckComboTableSorted.size() == 5) {
					// nếu 5 lá bài là sảnh, đánh bằng sảnh lớn hơn
					if (deckComboSorted.size() == 5 && whichCardIsBigger(deckComboSorted.get(4), deckComboTableSorted.get(4)) == 1) {
						return 1;
					}
				}
				
				// khi trên bàn có 6 lá bài
				if (deckComboTableSorted.size() == 6) {
					// nếu 6 lá là 3 đôi thông
					if (deckComboTableSorted.get(0).getPoint().equals(deckComboTableSorted.get(1).getPoint())
						&& deckComboTableSorted.get(2).getPoint().equals(deckComboTableSorted.get(3).getPoint())
						&& deckComboTableSorted.get(4).getPoint().equals(deckComboTableSorted.get(5).getPoint())) {
						
						// đánh bằng 3 đôi thông lớn hơn
						if (isSanh == false) {
							if (deckComboSorted.size() == 6 
								&& deckComboSorted.get(0).getPoint().equals(deckComboSorted.get(1).getPoint())
								&& deckComboSorted.get(2).getPoint().equals(deckComboSorted.get(3).getPoint())
								&& deckComboSorted.get(4).getPoint().equals(deckComboSorted.get(5).getPoint())
								&& whichCardIsBigger(deckComboSorted.get(5), deckComboTableSorted.get(5)) == 1) {
								return 1;
							}
						}
					
					}
					
					// nếu 6 lá bài là sảnh, đánh bằng sảnh lớn hơn
					if (deckComboSorted.size() == 6 && whichCardIsBigger(deckComboSorted.get(5), deckComboTableSorted.get(5)) == 1) {
						return 1;
					}
				}
				
				// khi trên bàn có 7 lá bài
				if (deckComboTableSorted.size() == 7) {
					// đánh bằng sảnh lớn hơn
					if (deckComboSorted.size() == 7 && whichCardIsBigger(deckComboSorted.get(6), deckComboTableSorted.get(6)) == 1) {
						return 1;
					}
				}
				
				// khi trên bàn có 8 lá bài
				if (deckComboTableSorted.size() == 8) {
					// nếu 8 lá bài là 4 đôi thông
					if (deckComboTableSorted.get(0).getPoint().equals(deckComboTableSorted.get(1).getPoint())
						&& deckComboTableSorted.get(2).getPoint().equals(deckComboTableSorted.get(3).getPoint())
						&& deckComboTableSorted.get(4).getPoint().equals(deckComboTableSorted.get(5).getPoint())
						&& deckComboTableSorted.get(6).getPoint().equals(deckComboTableSorted.get(7).getPoint())) {
						
						// đánh bằng 4 đôi thông lớn hơn
						if (isSanh == false) {
							if (deckComboSorted.size() == 4
								&& deckComboSorted.get(0).getPoint().equals(deckComboSorted.get(1).getPoint())
								&& deckComboSorted.get(2).getPoint().equals(deckComboSorted.get(3).getPoint())
								&& deckComboSorted.get(4).getPoint().equals(deckComboSorted.get(5).getPoint())
								&& deckComboSorted.get(6).getPoint().equals(deckComboSorted.get(7).getPoint())
								&& whichCardIsBigger(deckComboSorted.get(7), deckComboTableSorted.get(7)) == 1) {
								return 1;
							}
						}
						
					}
					
					// nếu 8 lá bài là sảnh 8 lá
					// đánh bằng sảnh lớn hơn
					if (deckComboSorted.size() == 8 && whichCardIsBigger(deckComboSorted.get(7), deckComboTableSorted.get(7)) == 1) {
						return 1;
					}	
				}
				
				// khi trên bàn có 9 lá bài
				if (deckComboTableSorted.size() == 9) {
					// đánh bằng sảnh lớn hơn
					if (deckComboSorted.size() == 9 && whichCardIsBigger(deckComboSorted.get(8), deckComboTableSorted.get(8)) == 1) {
						return 1;
					}
				}
				
				// khi trên bàn có 10 lá bài
				if (deckComboTableSorted.size() == 10) {
					// đánh bằng sảnh lớn hơn
					if (deckComboSorted.size() == 10 && whichCardIsBigger(deckComboSorted.get(9), deckComboTableSorted.get(9)) == 1) {
						return 1;
					}
				}
				
				// khi trên bàn có 11 lá bài
				if (deckComboTableSorted.size() == 11) {
					// đánh bằng sảnh lớn hơn
					if (deckComboSorted.size() == 11 && whichCardIsBigger(deckComboSorted.get(10), deckComboTableSorted.get(10)) == 1) {
						return 1;
					}
				}
				
				// khi trên bàn có 12 lá bài
				if (deckComboTableSorted.size() == 12) {
					// đánh bằng sảnh lớn hơn
					if (deckComboSorted.size() == 12 && whichCardIsBigger(deckComboSorted.get(11), deckComboTableSorted.get(11)) == 1) {
						return 1;
					}
				}
				
				// khi trên bàn có 13 lá bài
				if (deckComboTableSorted.size() == 13) {
					// đánh bằng sảnh lớn hơn
					if (deckComboSorted.size() == 13 && whichCardIsBigger(deckComboSorted.get(12), deckComboTableSorted.get(12)) == 1) {
						return 1;
					}
				}
				
				return 2;
			}
			
			// hàm này để kiểm tra xem bài đánh lên lần đầu tiên hoặc bài đè lên tạo 1 round mới có hợp lệ hay không
			public static boolean isRightForBeginNewRound(ArrayList<Card> deckCombo) {
				ArrayList<Card> deckComboSorted = sortDeck(deckCombo);
				
				
				boolean isSanh = true;
				if (deckComboSorted.size() == 1) {
					isSanh = false;
				} else {
					for (int i = 0; i < deckComboSorted.size() - 1; i++) {
						if (deckComboSorted.get(i).getPoint().equals(deckComboSorted.get(i + 1).getPoint())) {
							// xám cô hoặc đôi thông
							isSanh = false;
							break;
						} else {
							// nếu không liên tiếp thì bài đánh lên không hợp lệ
							
							// không có sảnh 2 lá, bài không hợp lệ
							if (deckComboSorted.size() == 2) {
								return false;
							}
							
							int pointOfCard1 = Integer.valueOf(deckComboSorted.get(i).getPoint());
							int pointOfCard2 = Integer.valueOf(deckComboSorted.get(i + 1).getPoint());
							
							if (pointOfCard2 != pointOfCard1 + 1) {
								// dã đến đây, tứ 100% là so sánh từ lá 2 - 3 trở lên
								// hay nói cách khác là lá đã có ít nhất lả 2 lá có điểm liên tiếp
								// nên nếu điều kiện này không thỏa thì đây là sam cô, tứ quý hoặc bộ bài không hợp lệ
								// ví dụ: 222. 567, 556, 5555
								// trước mắt thì đây không phải sảnh
								isSanh = false;
							}
						}
					}
				}
				
				// bất đầu 1 round mà đánh sảnh, thì luôn hợp lệ
				if (isSanh == true) {
					return true;
				}
				
				// bất đầu 1 round mới mà đánh lá đơn, thì luôn hợp lệ
				if (deckComboSorted.size() == 1) {
					return true;
				}
				
				// bất đầu 1 round mới mà đánh 2 lá, thì chỉ được đánh 2 lá đôi
				if (deckComboSorted.size() == 2 && deckComboSorted.get(0).getPoint().equals(deckComboSorted.get(1).getPoint())) {
					return true;
				}
				
				// bắt đầu 1 round mới mà đánh 3 lá, thì chỉ được sảnh hoặc là sám cô
				if (deckComboSorted.size() == 3 && deckComboSorted.get(0).getPoint().equals(deckComboSorted.get(1).getPoint())
					&& deckComboSorted.get(1).getPoint().equals(deckComboSorted.get(2).getPoint())) {
					return true;
				}
				
				
				// bắt đầu 1 round mới mà đánh 4 lá, thì chỉ được đánh sảnh hoặc là tứ quý
				if (deckComboSorted.size() == 4 && deckComboSorted.get(0).getPoint().equals(deckComboSorted.get(1).getPoint())
					&& deckComboSorted.get(1).getPoint().equals(deckComboSorted.get(2).getPoint())
					&& deckComboSorted.get(2).getPoint().equals(deckComboSorted.get(3).getPoint())) {
					return true;
				}
				
				// bất đầu 1 round mới mà đánh 6 lá, thì chỉ được đánh 3 đôi thông
				if (deckComboSorted.size() == 6 && deckComboSorted.get(0).getPoint().equals(deckComboSorted.get(1).getPoint())
					&& deckComboSorted.get(2).getPoint().equals(deckComboSorted.get(3).getPoint())
					&& deckComboSorted.get(4).getPoint().equals(deckComboSorted.get(5).getPoint())) {
					return true;
				}
				
				// bất đầu 1 round mới mà đánh 8 lá, thì chỉ được đánh 4 đôi thông
				if (deckComboSorted.size() == 6 && deckComboSorted.get(0).getPoint().equals(deckComboSorted.get(1).getPoint())
					&& deckComboSorted.get(2).getPoint().equals(deckComboSorted.get(3).getPoint())
					&& deckComboSorted.get(4).getPoint().equals(deckComboSorted.get(5).getPoint())
					&& deckComboSorted.get(6).getPoint().equals(deckComboSorted.get(7).getPoint())) {
					return true;
				}
				
				
				return false;
			}
			
			static ArrayList<Card> deck1 = new ArrayList<Card>();
			static ArrayList<Card> deck2 = new ArrayList<Card>();
			public static void main(String[] args) {
				Card card1 = new Card(9,"bich", "5", "url");
				Card card2= new Card(6,"co", "7", "url");
				Card card3 = new Card(7,"tep", "7", "url");
				Card card4 = new Card(6,"co", "7", "url");
				
				deck1.add(card4);
				//deck1.add(card2);
				//deck1.add(card3);
				//deck1.add(card4);
				
				deck2.add(card2);
				//deck2.add(card3);
				//deck2.add(card4);
				
				sortDeck(deck1);
				sortDeck(deck2);
				
//				for (int i = 0; i < deck1.size(); i++) {
//					System.out.println(deck1.get(i).getPoint());
//					System.out.println(deck1.get(i).getHouse());
//				}
				
				System.out.println(isComboCardBigger(deck1, deck2));
			}
		}
