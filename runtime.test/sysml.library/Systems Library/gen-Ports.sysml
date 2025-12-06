standard library package Ports{
	doc /*
     * This package defines the base types for ports and related structural elements 
     * in the SysML language.
     */
	private import Objects::Object;
	private import Objects::objects;
	abstract port def Port : Object{
		doc /*
         * Port is the most general class of objects that represent connection points
         * for interacting with a Part. Port is the base type of all PortDefinitions.
         * 
         * Transfers outgoing from a Port are always targeted to a Port connected to
         * the original Port by an Interface.
         */
		ref self : Port :>> Object::self;
		port subports [ 0 .. * ] : Port :> ports :> timeEnclosedOccurrences{
			doc /*
             * The Ports that are subports of this Port.
             */
		}
		abstract ref port interfacingPorts [ 0 .. * ] nonunique : Port :> ports{
			doc /*
             * Ports that are connected to this Port by an Interface.
             */
		}
		ref :> interfacingPorts.incomingTransfersToSelf :>> outgoingTransfersFromSelf{
			doc /* 
             * The target of each of the outgoingTransfersFromSelf of a Port must be an interfacingPort.
             */
			end ref source;
			end ref target;
		}
	}
	abstract port ports [ 0 .. * ] nonunique : Port :> objects{
		doc /*
         * ports is the base feature of all PortUsages.
         */
	}
}
