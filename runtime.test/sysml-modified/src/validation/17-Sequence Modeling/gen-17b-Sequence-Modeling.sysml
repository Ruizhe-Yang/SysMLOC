package '17b-Sequence-Modeling'{
	private import ScalarValues :: *;
	private import PayloadDefinitions :: *;
	package PayloadDefinitions{
		item def Subscribe{
			attribute topic : String;
			ref part subscriber;
		}
		item def Publish{
			attribute topic : String;
			ref publication;
		}
		item def Deliver{
			ref publication;
		}
	}
	occurrence def PubSubSequence{
		part producer [ 1 ]{
			event publish_message.sourceEvent;
		}
		message publish_message of [ 1 ] Publish;
		part server [ 1 ]{
			event subscribe_message.targetEvent;
			then event publish_message.targetEvent;
			then event deliver_message.sourceEvent;
		}
		message subscribe_message of [ 1 ] Subscribe;
		message deliver_message of [ 1 ] Deliver;
		part consumer [ 1 ]{
			event subscribe_message.sourceEvent;
			then event deliver_message.targetEvent;
		}
	}
}
