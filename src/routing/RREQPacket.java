package routing;

public class RREQPacket {
	private int sourceNodeId;
    private int destinationNodeId;

    public RREQPacket(int sourceNodeId, int destinationNodeId) {
        this.sourceNodeId = sourceNodeId;
        this.destinationNodeId = destinationNodeId;
    }

    public int getSourceNodeId() {
        return sourceNodeId;
    }

    public int getDestinationNodeId() {
        return destinationNodeId;
    }
}
