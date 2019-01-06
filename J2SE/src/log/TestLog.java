package log;

import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.Level;

public class TestLog {
	public TestLog() throws InterruptedException {
		Logger logger = Logger.getLogger(TestLog.class);
		PropertyConfigurator.configure("E:\\MyCode\\Java\\J2SE\\src\\log\\log.properties");
		logger.setLevel(Level.DEBUG);
		logger.trace("������Ϣ");
		logger.debug("������Ϣ");
		logger.info("�����Ϣ");
		Thread.sleep(1000);
		logger.warn("������Ϣ");
		logger.error("������Ϣ");
		logger.fatal("������Ϣ");
	}
}
