package 语法.优化的异常处理;

import java.text.MessageFormat;
import java.util.ResourceBundle;

/**
 * 支持国际化异常消息的异常类的基类
 */
public abstract class LocalizedException extends Exception {
    private static final String DEFAULT_BASE_NAME = "message";
    private String baseName = DEFAULT_BASE_NAME;
    protected ResourceBundle resourceBundle;
    private String messageKey;

    public LocalizedException(String messageKey) {
        this.messageKey = messageKey;
        initResourceBundle();
    }

    public LocalizedException(String messageKey, String baseName) {
        this.messageKey = messageKey;
        this.baseName = baseName;
        initResourceBundle();
    }

    private void initResourceBundle() {
        resourceBundle = ResourceBundle.getBundle(baseName);
    }

    protected void setBaseName(String baseName) {
        this.baseName = baseName;
    }

    public void setMessageKey(String messageKey) {
        this.messageKey = messageKey;
    }

    public abstract String getLocalizedMessage();

    public String getMessage() {
        return getLocalizedMessage();
    }

    protected String format(Object... args) {
        String message = resourceBundle.getString(messageKey);
        return MessageFormat.format(message, args);
    }
}
