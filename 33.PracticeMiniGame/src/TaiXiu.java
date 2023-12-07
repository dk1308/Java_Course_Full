import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

/*  Một người chơi sẽ có tài khoản. Người chơi có quyền đặt cược số tiền ít hơn hoặc bằng * số tiền họ đang có.
	 *  Luật chơi như sau: * Có 3 viên xúc xắc. Mõi viên xúc có 6 mặt có giá tị từ 1 đến 6. 
	 *  Mỗi lần lắc sẽ ra một kết quả. Kết quả = giá trị xx1 + giá trị xx2 + giá xx3 
	 *  1. Nếu tổng = 3 hoặc 18 => Cái ăn hết, người chơi thua. 
	 *  2. Nếu tổng = (4-10) <-> xỉu => nếu người chơi đặt tài thì người chơi thắng, ngược lại thua  
	 *  3. Nếu tổng = (11-17) <-> tài => nếu người chơi đặt xỉu thì người chơi thắng, ngược lại thua 
	 */

public class TaiXiu {
	public static void main(String[] args) {

//		Start Code

		double moneyOfPlayer = 5000000;
		Scanner sc = new Scanner(System.in);
		double choiceMoney = 0;
		byte choiceTX = 0;
		byte choiceGame = 0;
/*
		Lớp Locale 
		Lớp NumberFormat
*/
		Locale lc = new Locale("vi", "VN");
		NumberFormat nf = NumberFormat.getCurrencyInstance(lc);

//		Lựa chọn của người chơi

		do {
			System.out.println("1-START");
			System.out.println("2-QUIT GAME");
			System.out.println("Mời bạn lựa chọn: ");
			choiceGame = sc.nextByte();
		} while (choiceGame != 1 && choiceGame != 2);

		if (choiceGame != 1)
			System.out.println("Trò chơi kết thúc!");
		else {
			do {
				System.out.println();
				System.out.println("***BẮT ĐẦU CHƠI***");
				System.out.println("Nhập số tiền đặt cược: ");
				choiceMoney = sc.nextDouble();
				if (choiceMoney <= 0 || choiceMoney > moneyOfPlayer) {
					do {
						System.out.println("Không hợp lệ. Vui lòng nhập lại: ");
						choiceMoney = sc.nextDouble();
					} while (choiceMoney <= 0 || choiceMoney > moneyOfPlayer);
				}

				System.out.println();
				System.out.println("1-Đặt tài");
				System.out.println("2-Đặt xỉu");
				System.out.println("Nhập lựa chọn: ");
				choiceTX = sc.nextByte();
				if (choiceTX != 1 && choiceTX != 2) {
					do {
						System.out.println("1-Đặt tài");
						System.out.println("2-Đặt xỉu");
						System.out.println("Không hợp lệ, vui lòng nhập lại: ");
						choiceTX = sc.nextByte();
					} while (choiceTX != 1 && choiceTX != 2);
				}

				System.out.println();

/*
 * 				Bắt đầu rung xúc xắc 
 * 				Lớp Random
 */
				Random xucxac = new Random();

				int xx1 = xucxac.nextInt(6) + 1;
				int xx2 = xucxac.nextInt(6) + 1;
				int xx3 = xucxac.nextInt(6) + 1;

				int kq = xx1 + xx2 + xx3;
				System.out.println("Kết quả: " + kq);
				System.out.println();

//				Tính kết quả của người chơi
				if (kq == 3 || kq == 18) {
					System.out.println("Bạn thua!");
					moneyOfPlayer -= choiceMoney;
					System.out.println("Số tiền trong tài khoản: " + nf.format(moneyOfPlayer));
					System.out.println();
				} else if (choiceTX != 1 && kq >= 11 && kq <= 17) {
					System.out.println("Bạn thua!");
					moneyOfPlayer -= choiceMoney;
					System.out.println("Số tiền trong tài khoản: " + nf.format(moneyOfPlayer));
					System.out.println();
				} else if (choiceTX != 2 && kq >= 2 && kq <= 10) {
					System.out.println("Bạn thua!");
					moneyOfPlayer -= choiceMoney;
					System.out.println("Số tiền trong tài khoản: " + nf.format(moneyOfPlayer));
					System.out.println();
				} else {
					System.out.println("Bạn thắng!");
					moneyOfPlayer += choiceMoney;
					System.out.println("Số tiền trong tài khoản: " + nf.format(moneyOfPlayer));
					System.out.println();
				}

				if (moneyOfPlayer == 0) {
					System.out.println("Bạn đã hết tiền. Vui lòng nạp thêm tiền!");
					System.exit(0);
				} else {
//					Lựa chọn của người chơi
					do {
						System.out.println("1-CONTINUE");
						System.out.println("2-QUIT GAME");
						System.out.println("Mời bạn lựa chọn: ");
						choiceGame = sc.nextByte();
					} while (choiceGame != 1 && choiceGame != 2);
				}

				if (choiceGame == 2) {
					System.out.println("Trò chơi kết thúc!");
					System.exit(0);
				}
			} while (choiceGame == 1);
		}

//		End Code
	}

}
