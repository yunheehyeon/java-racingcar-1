package cal;

import cal.domain.StringCalculator;
import cal.util.StringUtil;
import cal.view.InputView;

import java.util.List;

public class CalculateApp {

    public static void main(String[] args) {
        String inputString = InputView.inputString();
        List<String> strings = StringUtil.parseStringByComma(inputString);

        double first = Double.parseDouble(strings.get(0));
        for (int i = 1; i < strings.size(); i = i +2) {
            String operator = strings.get(i);
            double second = Double.parseDouble(strings.get(i+1));
            first = StringCalculator.calculate(operator, first, second);
        }

        System.out.println(first);
    }
}
