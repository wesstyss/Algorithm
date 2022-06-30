/*
На вход дается строка, состоящая из скобок, надо провалидировать ее,
Валидная скобка имеет вид ()()
Или (())()
То есть на каждую открытую скобку есть закрытая и они в правильном порядке
()()
()))
())(
(())
*/
public class Parenthesis {
    public static void main(String[] args) {
        String str = "()()";
        String str1 = "()))";
        String str2 = "())(";
        String str3 = "(())";
        System.out.println(validate(str));
        System.out.println(validate(str1));
        System.out.println(validate(str2));
        System.out.println(validate(str3));
    }

    public static boolean validate(String string){
        int count = 0;
                for (int i = 0; i < string.length(); i++) {
            if (count < 0){
                return false;
            }
        String oneSymbol = string.substring(i,i+1);
            if(oneSymbol.equals("(")){
                count++;
            }else {
                count--;
            }
        }
            if(count == 0){
              return true;
            }else return false;
    }
}
