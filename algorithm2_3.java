// FizzBuzz�����ǂ���
//�O���S���I��̉[�N���� - ������
public class Main {
    public static void main(String[] args) throws Exception {
        int seireki = (int)(Math.random() * 3000 + 1);

        if (seireki % 400 == 0) { // (�������C��) ����N��400�Ŋ���؂��Ƃ�
            System.out.println(seireki + " leap year");
        } else if (seireki % 100 == 0) { // (�������C��) ����ȊO�ŁA����N��100�Ŋ���؂��Ƃ�
            System.out.println(seireki);
        } else if (seireki % 4 == 0) { // (�������C��) ����ȊO�ŁA����N��4�Ŋ���؂��Ƃ�
            System.out.println(seireki + " leap year");
        } else { // ����ȊO�̂Ƃ�
            System.out.println(seireki);
        }
    }
}
