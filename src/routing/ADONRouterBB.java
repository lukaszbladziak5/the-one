package routing;

import java.util.List;

import core.DTNHost;
import core.MessageListener;
import core.Settings;

public class ADONRouterBB extends ActiveRouter{
	
	public ADONRouterBB(Settings s) {
		super(s);
		// TODO Auto-generated constructor stub
	}
	
	public ADONRouterBB(ActiveRouter r) {
		super(r);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void init(DTNHost host, List<MessageListener> mListeners) {
		super.init(host, mListeners);
	}

	@Override
	public MessageRouter replicate() {
		// TODO Auto-generated method stub
		return null;
	}
}
