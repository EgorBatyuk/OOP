public class Complex {// множественный класс
        String num1_1;
        String num1_2;

        String num2_1;
        String num2_2;// мнимая часть

        Complex (String num1_1, String num1_2, String num2_1, String num2_2) {// конструктор с параметрами
        this.num1_1 = num1_1;
        this.num1_2 = num1_2;
        this.num2_1 = num2_1;
        this.num2_2 = num2_2;
        }

public Complex() {
        }

        public Complex(String num1_1) {
                this.num1_1 = num1_1;
        }

        public int cut(String cut_num){
        int index_i_1 = cut_num.indexOf('i');
        StringBuffer stringBuffer = new StringBuffer(cut_num);
        stringBuffer.delete(index_i_1,index_i_1+1);
        cut_num = stringBuffer.toString();
        return Integer.parseInt(cut_num);
}

public void add(String num1_1, String num1_2, String num2_1, String num2_2){

                int sum_1 = Integer.parseInt(num1_1) + Integer.parseInt(num2_1);
                int sum_2 = cut(num1_2) + cut(num2_2);

        System.out.printf("%d + %di\n",sum_1, sum_2);
        }

        public void multiplication(String num1_1, String num1_2, String num2_1, String num2_2){
                int first = (Integer.parseInt(num1_1) * Integer.parseInt(num2_1)) - (cut(num1_2) * cut(num2_2));
                int second = (Integer.parseInt(num1_1)*cut(num2_2)) + (cut(num1_2) * Integer.parseInt(num2_1));
                int result = first + second;
                System.out.printf("%d + %di\n", first, second);
        }
}


