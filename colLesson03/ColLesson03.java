package colLesson03;

import java.util.Scanner;

public class ColLesson03{

	@SuppressWarnings("resource")
	public static void main(String[] args){
			Word[] words = new Word[5];

			System.out.println("英単語と日本語をスペースで区切って入力してください。");
			Scanner sc = new Scanner(System.in);
			String input = sc.nextLine();
			int index = 0;
			try{
			while (!input.equals("e")){
							String[] tmp = new String[2];
							tmp = input.split(" ");
							Word wd = new Word(tmp[0], tmp[1]);
							words[index] = wd;
							index++;
							System.out.println("次の英単語と日本語を入力してください。\"e\"で終了します。");
							input = sc.nextLine();

			}
			} catch (ArrayIndexOutOfBoundsException e){
				System.out.println("登録制限を越えました。登録済みのデータは以下になります。");
			}
			for (int i = 0; i < index; i++){
				System.out.println(words[i].getJapanese() + ":" + words[i].getEnglish());
				}
			System.out.println(index + "件、登録しました。");
			}
}