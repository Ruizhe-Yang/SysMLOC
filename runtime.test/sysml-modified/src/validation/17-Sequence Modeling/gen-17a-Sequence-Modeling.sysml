package '17a-Sequence-Modeling'{
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
			event occurrence publish_source_event;
		}
		message publish_message of [ 1 ] Publish producer.publish_source_event to server.publish_target_event;
		part server [ 1 ]{
			event occurrence subscribe_target_event;
			then event occurrence publish_target_event;
			then event occurrence deliver_source_event;
		}
		message subscribe_message of [ 1 ] Subscribe consumer.subscribe_source_event to server.subscribe_target_event;
		message deliver_message of [ 1 ] Deliver server.deliver_source_event to consumer.deliver_target_event;
		part consumer [ 1 ]{
			event occurrence subscribe_source_event;
			then event occurrence deliver_target_event;
		}
	}
}
