package jp.co.Person.action;

public class Test {

	public static void main(String[] args) {

		Person taro = new Person();
		taro.name = "山田太郎";
		taro.age = 20;
		taro.phoneNumber = "090-0000-0000";
		taro.address = "236-0087";

		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(taro.phoneNumber);
		System.out.println(taro.address);


		Person kimura = new Person();
		kimura.name = "木村次郎";
		kimura.age = 18;

		System.out.println(kimura.name);
		System.out.println(kimura.age);

		Person suzuki = new Person();
		suzuki.name = "鈴木花子";
		suzuki.age = 16;

		System.out.println(suzuki.name);
		System.out.println(suzuki.age);

		Person hara = new Person();
		hara.name = "原崇之";
		hara.age = 28;

		System.out.println(hara.name);
		System.out.println(hara.age);


		//演習６メソッド呼び出し
		taro.talk();
		taro.walk();
		taro.run();



	}
}
