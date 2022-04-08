public class IntsCalculator implements Ints {

    Calculator cal = new Calculator();

    @Override
    public int sum(int arg0, int arg1) {
        return (int) cal.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.SUM)
                .result();
    }

    @Override
    public int sub(int arg0, int arg1) {
        return (int) cal.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.SUB)
                .result();
    }

    @Override
    public int mult(int arg0, int arg1) {
        return (int) cal.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.MULT)
                .result();
    }

    @Override
    public int div(int a, int b) {
        return (int) cal.newFormula()
                .addOperand(a)
                .addOperand(b)
                .calculate(Calculator.Operation.DIV)
                .result();
    }

    @Override
    public int pow(int a, int b) {
        return (int) cal.newFormula()
                .addOperand(a)
                .addOperand(b)
                .calculate(Calculator.Operation.POW)
                .result();
    }
}
