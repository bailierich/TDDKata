public class StringCalculator {

	public static int add(String numbers) {
		int answer = 0;
		if (numbers.equals("")) {
			answer = 0;
		} else if (numbers.contains("//")) {
			char delimeter = numbers.charAt(2);

			String splitChar = String.valueOf(delimeter);
			String numbersWithoutPrefix = numbers.substring(4);
			
			String[] delimeterArr = numbersWithoutPrefix.split(splitChar);

			for (int i = 0; i < delimeterArr.length; i++) {
				int num = Integer.parseInt(delimeterArr[i]);
					if (num > 1000) {
						num = 0;
					}
				answer += num;
			}
		} else if (!numbers.contains(",")) {
			answer = Integer.parseInt(numbers);
		} else {
			String[] numArray = numbers.split("\n |, ");

			int i = 0;
			for (String s : numArray) {
				i = Integer.parseInt(s);
				if (i > 1000) {
					i = 0;
				}
				answer += i;
			}

		}
		return answer;

	}

}