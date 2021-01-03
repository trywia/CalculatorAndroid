package com.example.calculatorandroid;

public class MethodsCalculator {
    private static double number;
    private static String sign;
    private static String prevSign;
    private static double lastOperation;

    public String onChangeSignClicked(String display) {
        String[] displayText = display.split("");
        if (Double.parseDouble(display) != 0) {
            if (displayText[0].equals("-")) {
                String signText = "";
                for (int i = 1; i < displayText.length; i++) {
                    signText += displayText[i];
                }
                display = signText;
            } else {
                display = "-" + display;
            }
        }
        return display;
    }

    public String onAddClicked(String display) {
        if (number != 0) {
            double number1 = Double.parseDouble(display);
            if (sign.equals("+")) {
                number += number1;
            } else if (sign.equals("-")) {
                number -= number1;
            } else if (sign.equals("*")) {
                number *= number1;
            } else if (sign.equals("/")) {
                number /= number1;
            }
            sign = "+";
            display = "0";
        } else {
            number = Double.parseDouble(display);
            sign = "+";
            display = "0";
        }
        return display;
    }

    public String onClearClicked(String display) {
        lastOperation = 0;
        number = 0;
        sign = "";
        display = "0";
        return display;
    }

    public String onDivideClicked(String display) {
        if (number != 0) {
            double number1 = Double.parseDouble(display);
            if (sign.equals("+")) {
                number += number1;
            } else if (sign.equals("-")) {
                number -= number1;
            } else if (sign.equals("*")) {
                number *= number1;
            } else if (sign.equals("/")) {
                number /= number1;
            }
            sign = "/";
            display = "0";
        } else {
            number = Double.parseDouble(display);
            sign = "/";
            display = "0";
        }
        return display;
    }

    public String onDotClicked(String display) {
        String[] displayText = display.split("");
        boolean flag = false;
        // check if there is no dot already
        for (int i = 0; i < displayText.length; i++) {
            if (displayText[i].equals(".")) {
                flag = true;
            }
        }
        // no dots
        if (!flag) {
            display = (display + ".");
        }
        return display;
    }

    public String onEightClicked(String display) {
        if (display.equals("0")) {
            display = ("8");
        } else {
            display = (display + "8");
        }
        return display;
    }

    public String onEqualClicked(String display) {
        double number1 = Double.parseDouble(display);

        if (sign.equals("")) {

            // repeat last operation
            if (prevSign.equals("+")) {
                number += lastOperation;
                display = (Double.toString(number));
            } else if (prevSign.equals("-")) {
                number -= lastOperation;
                display = (Double.toString(number));
            } else if (prevSign.equals("*")) {
                number *= lastOperation;
                display = (Double.toString(number));
            } else if (prevSign.equals("/")) {
                number /= lastOperation;
                display = (Double.toString(number));
            }
            sign = prevSign;
        } else if (sign.equals("+")) {
            lastOperation = Double.parseDouble(display);
            number += number1;
            display = (Double.toString(number));
        } else if (sign.equals("-")) {
            lastOperation = Double.parseDouble(display);
            number -= number1;
            display = (Double.toString(number));
        } else if (sign.equals("*")) {
            lastOperation = Double.parseDouble(display);
            number *= number1;
            display = (Double.toString(number));
        } else if (sign.equals("/")) {
            lastOperation = Double.parseDouble(display);
            number /= number1;
            display = (Double.toString(number));
        }
        prevSign = sign;
        sign = "";
        return display;
    }

    public String onFiveClicked(String display) {
        if (display.equals("0")) {
            display = ("5");
        } else {
            display = (display + "5");
        }
        return display;
    }

    public String onFourClicked(String display) {
        if (display.equals("0")) {
            display = ("4");
        } else {
            display = (display + "4");
        }
        return display;
    }

    public String onMultiplyClicked(String display) {
        if (number != 0) {
            double number1 = Double.parseDouble(display);
            if (sign.equals("+")) {
                number += number1;
            } else if (sign.equals("-")) {
                number -= number1;
            } else if (sign.equals("*")) {
                number *= number1;
            } else if (sign.equals("/")) {
                number /= number1;
            }
            sign = "*";
            display = ("0");
        } else {
            number = Double.parseDouble(display);
            sign = "*";
            display = ("0");
        }
        return display;
    }

    public String onNineClicked(String display) {
        if (display.equals("0")) {
            display = ("9");
        } else {
            display = (display + "9");
        }
        return display;
    }

    public String onOneClicked(String display) {
        if (display.equals("0")) {
            display = ("1");
        } else {
            display = (display + "1");
        }
        return display;
    }

    public String onPercentClicked(String display) {
        double number1 = Double.parseDouble(display);
        number1 /= 100;
        display = (Double.toString(number1));
        return display;
    }

    public String onSevenClicked(String display) {
        if (display.equals("0")) {
            display = ("7");
        } else {
            display = (display + "7");
        }
        return display;
    }

    public String onSixClicked(String display) {
        if (display.equals("0")) {
            display = ("6");
        } else {
            display = (display + "6");
        }
        return display;
    }

    public String onSubtractClicked(String display) {
        if (number != 0) {
            double number1 = Double.parseDouble(display);
            if (sign.equals("+")) {
                number += number1;
            } else if (sign.equals("-")) {
                number -= number1;
            } else if (sign.equals("*")) {
                number *= number1;
            } else if (sign.equals("/")) {
                number /= number1;
            }
            sign = "-";
            display = ("0");
        } else {
            number = Double.parseDouble(display);
            sign = "-";
            display = ("0");
        }
        return display;
    }

    public String onThreeClicked(String display) {
        if (display.equals("0")) {
            display = ("3");
        } else {
            display = (display + "3");
        }
        return display;
    }

    public String onTwoClicked(String display) {
        if (display.equals("0")) {
            display = ("2");
        } else {
            display = (display + "2");
        }
        return display;
    }

    public String onZeroClicked(String display) {
        if (display.equals("0")) {
            display = ("0");
        } else {
            display = (display + "0");
        }
        return display;
    }
}

