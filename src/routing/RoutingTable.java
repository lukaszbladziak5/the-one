package routing;

import java.util.HashMap;
import java.util.Map;

public class RoutingTable {
    private Map<Integer, RouteEntry> routingMap;

    public RoutingTable() {
        this.routingMap = new HashMap<>();
    }

    public void updateRoute(int destinationNodeId, RouteEntry route) {
        routingMap.put(destinationNodeId, route);
    }

    public RouteEntry getRoute(int destinationNodeId) {
        return routingMap.get(destinationNodeId);
    }
}

class RouteEntry {
    private int nextHopNodeId;
    private double cost;

    public RouteEntry(int nextHopNodeId, double cost) {
        this.nextHopNodeId = nextHopNodeId;
        this.cost = cost;
    }

    public int getNextHopNodeId() {
        return nextHopNodeId;
    }

    public double getCost() {
        return cost;
    }
}
