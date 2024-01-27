package routing;

public class RREPPacket {
    private int sourceNodeId;
    private int destinationNodeId;
    private int nextHopNodeId;

    public RREPPacket(int sourceNodeId, int destinationNodeId, int nextHopNodeId) {
        this.sourceNodeId = sourceNodeId;
        this.destinationNodeId = destinationNodeId;
        this.nextHopNodeId = nextHopNodeId;
    }

    public int getSourceNodeId() {
        return sourceNodeId;
    }

    public int getDestinationNodeId() {
        return destinationNodeId;
    }

    public int getNextHopNodeId() {
        return nextHopNodeId;
    }
}
