package univ.lecture;

import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.script.ScriptEngine;


/**
 * Created by tchi on 2017. 3. 19..
 */
public class Calculator {
    public int calculate(String exp) {

	ScriptEngineManager mgr = new ScriptEngineManager();
	ScriptEngine engine = mgr.getEngineByName("JavaScript");

	try {
		return (int)engine.eval(exp);
	} catch (ScriptException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		return 0;
	}
    }
}
