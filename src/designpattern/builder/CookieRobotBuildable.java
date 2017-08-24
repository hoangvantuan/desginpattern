package designpattern.builder;

import java.util.ArrayList;
import java.util.Iterator;

public class CookieRobotBuildable implements RobotBuildable {

	public ArrayList<Integer> actions;

	public CookieRobotBuildable() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public void go() {
		Iterator<Integer> it = actions.iterator();

		while(it.hasNext()) {
			switch((Integer) it.next()) {
			case 1:
				start();
				break;
			case 2:
				getParts();
				break;
			case 3:
				stop();
				break;
			case 4:
				test();
				break;
			default: break;
			}
		}

	}

	public void start() {
		System.out.println("Start");
	}

	public void getParts() {
		System.out.println("get parts");
	}

	public void stop() {
		System.out.println("stop");
	}

	public void test() {
		System.out.println("test");
	}

	public void loadActions(ArrayList a) {
		actions = a;
	}


}
