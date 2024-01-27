package routing;

import java.util.List;

import core.Connection;
import core.DTNHost;
import core.MessageListener;
import core.Settings;

public class ADONRouterBB extends ActiveRouter{
	
    private RoutingTable routingTable;
    
	public ADONRouterBB(Settings s) {
		super(s);
	}
	
	public ADONRouterBB(ADONRouterBB r) {
		super(r);
	}

    @Override
    public ADONRouterBB replicate() {
        // Tworzenie nowego obiektu ADONRouterBB
        ADONRouterBB replicatedRouter = new ADONRouterBB(this);
        return replicatedRouter;
    }
    
    @Override
    public void changedConnection(Connection con) {
        super.changedConnection(con);

        DTNHost otherHost = con.getOtherNode(this.getHost());
        int otherNodeId = otherHost.getRouter().getRouterId();

        // Tutaj możesz zaktualizować tablicę routingu na podstawie zmiany połączenia
        // Przykładowe użycie:
        RouteEntry route = new RouteEntry(otherNodeId, calculateCost(con));
        routingTable.updateRoute(otherNodeId, route);
    }
    
    private double calculateCost(Connection con) {
        // Przykładowa implementacja
        double latency = con.getLatency();
        
        // Dodatkowe czynniki, które wpływają na koszt połączenia (możesz dostosować według potrzeb)
        double reliability = con.getReliability();
        double bandwidth = con.getBandwidth();

        // Prosta suma czynników (możesz dostosować wagę poszczególnych czynników)
        double cost = latency + 1 / reliability + 1 / bandwidth;

        return cost;
    }

}
