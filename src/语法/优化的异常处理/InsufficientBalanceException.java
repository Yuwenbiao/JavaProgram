package 语法.优化的异常处理;

import java.math.BigDecimal;

/**
 * 继承自支持国际化异常消息的异常类的子类
 */
public class InsufficientBalanceException extends LocalizedException {
    private BigDecimal requested;
    private BigDecimal balance;
    private BigDecimal shortage;

    public InsufficientBalanceException(BigDecimal requested, BigDecimal balance) {
        super("INSUFFICIENT_BALANCE_EXCEPTION");
        this.requested = requested;
        this.balance = balance;
        this.shortage = requested.subtract(balance);
    }

    @Override
    public String getLocalizedMessage() {
        return format(balance, requested, shortage);
    }
}
