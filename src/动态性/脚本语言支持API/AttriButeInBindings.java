package 动态性.脚本语言支持API;

import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * 自定义属性保存在语言绑定对象中的示例
 */
public class AttriButeInBindings {
    public static void main(String[] args) throws ScriptException {
        attributeInBindings();
    }

    private static void attributeInBindings() throws ScriptException {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("JavaScript");
        ScriptContext context = engine.getContext();
        context.setAttribute("name", "Alex", ScriptContext.GLOBAL_SCOPE);
        engine.eval("print(name);");
    }
}
