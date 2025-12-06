standard library package SysML{
	doc /*
	 * This package contains a reflective KerML model of the KerML abstract syntax.
	 */
	private import ScalarValues :: *;
	public import Systems :: *;
	package Systems{
		public import KerML::Kernel :: *;
		metadata def AcceptActionUsage : ActionUsage{
			derived ref item receiverArgument [ 0 .. 1 ] : Expression :> Metadata::metadataItems;
			derived ref item payloadParameter [ 1 .. 1 ] : ReferenceUsage :> nestedReference :> parameter :> Metadata::metadataItems;
			derived ref item payloadArgument [ 0 .. 1 ] : Expression :> Metadata::metadataItems;
		}
		metadata def ActionDefinition : Behavior , OccurrenceDefinition{
			derived ref item 'action' [ 0 .. * ] ordered : ActionUsage :> step :> usage :> Metadata::metadataItems;
		}
		metadata def ActionUsage : Step , OccurrenceUsage{
			derived ref item actionDefinition [ 0 .. * ] ordered : Behavior :> Metadata::metadataItems :>> behavior :>> occurrenceDefinition;
		}
		metadata def ActorMembership : ParameterMembership{
			derived item ownedActorParameter [ 1 .. 1 ] : PartUsage :> Metadata::metadataItems :>> ownedMemberParameter;
		}
		metadata def AllocationDefinition : ConnectionDefinition{
			derived ref item 'allocation' [ 0 .. * ] ordered : AllocationUsage :> usage :> Metadata::metadataItems;
		}
		metadata def AllocationUsage : ConnectionUsage{
			derived ref item allocationDefinition [ 0 .. * ] ordered : AllocationDefinition :> Metadata::metadataItems :>> connectionDefinition;
		}
		metadata def AnalysisCaseDefinition : CaseDefinition{
			derived ref item resultExpression [ 0 .. 1 ] : Expression :> expression :> ownedFeature :> Metadata::metadataItems;
		}
		metadata def AnalysisCaseUsage : CaseUsage{
			derived ref item analysisCaseDefinition [ 0 .. 1 ] : AnalysisCaseDefinition :> Metadata::metadataItems :>> caseDefinition;
			derived ref item resultExpression [ 0 .. 1 ] : Expression :> ownedFeature :> Metadata::metadataItems;
		}
		metadata def AssertConstraintUsage : ConstraintUsage , Invariant{
			derived ref item assertedConstraint [ 1 .. 1 ] : ConstraintUsage :> Metadata::metadataItems;
		}
		metadata def AssignmentActionUsage : ActionUsage{
			derived ref item targetArgument [ 0 .. 1 ] : Expression :> Metadata::metadataItems;
			derived ref item valueExpression [ 0 .. 1 ] : Expression :> Metadata::metadataItems;
			derived ref item referent [ 1 .. 1 ] : Feature :> member :> Metadata::metadataItems;
		}
		metadata def AttributeDefinition : DataType , Definition;
		metadata def AttributeUsage : Usage{
			derived attribute isReference [ 1 .. 1 ] : Boolean :>> isReference;
			derived ref item attributeDefinition [ 0 .. * ] ordered : DataType :> Metadata::metadataItems :>> definition;
		}
		metadata def BindingConnectorAsUsage : BindingConnector , ConnectorAsUsage;
		metadata def CalculationDefinition : Function , ActionDefinition{
			derived ref item calculation [ 0 .. * ] ordered : CalculationUsage :> 'action' :> expression :> Metadata::metadataItems;
		}
		metadata def CalculationUsage : Expression , ActionUsage{
			derived ref item calculationDefinition [ 0 .. 1 ] ordered : Function :> Metadata::metadataItems :>> function :>> actionDefinition;
		}
		metadata def CaseDefinition : CalculationDefinition{
			derived ref item objectiveRequirement [ 0 .. 1 ] ordered : RequirementUsage :> usage :> Metadata::metadataItems;
			derived ref item subjectParameter [ 1 .. 1 ] : Usage :> parameter :> usage :> Metadata::metadataItems;
			derived ref item actorParameter [ 0 .. * ] ordered : PartUsage :> parameter :> usage :> Metadata::metadataItems;
		}
		metadata def CaseUsage : CalculationUsage{
			derived ref item objectiveRequirement [ 0 .. 1 ] ordered : RequirementUsage :> usage :> Metadata::metadataItems;
			derived ref item caseDefinition [ 0 .. 1 ] : CaseDefinition :> Metadata::metadataItems :>> calculationDefinition;
			derived ref item subjectParameter [ 1 .. 1 ] : Usage :> parameter :> usage :> Metadata::metadataItems;
			derived ref item actorParameter [ 0 .. * ] ordered : PartUsage :> parameter :> usage :> Metadata::metadataItems;
		}
		metadata def ConcernDefinition : RequirementDefinition;
		metadata def ConcernUsage : RequirementUsage{
			derived ref item concernDefinition [ 0 .. 1 ] : ConcernDefinition :> Metadata::metadataItems :>> requirementDefinition;
		}
		metadata def ConjugatedPortDefinition : PortDefinition{
			derived ref item originalPortDefinition [ 1 .. 1 ] : PortDefinition :> Metadata::metadataItems :>> owningNamespace;
			derived ref item ownedPortConjugator [ 1 .. 1 ] : PortConjugation :> Metadata::metadataItems :>> ownedConjugator;
		}
		metadata def ConjugatedPortTyping : FeatureTyping{
			ref item conjugatedPortDefinition [ 1 .. 1 ] : ConjugatedPortDefinition :> Metadata::metadataItems :>> type;
			derived ref item portDefinition [ 1 .. 1 ] : PortDefinition :> Metadata::metadataItems;
		}
		metadata def ConnectionDefinition : AssociationStructure , PartDefinition{
			attribute isSufficient [ 1 .. 1 ] : Boolean :>> isSufficient;
			derived ref item connectionEnd [ 0 .. * ] ordered : Usage :> Metadata::metadataItems :>> associationEnd;
		}
		metadata def ConnectionUsage : ConnectorAsUsage , PartUsage{
			derived ref item connectionDefinition [ 0 .. * ] ordered : AssociationStructure :> itemDefinition :> Metadata::metadataItems :>> association;
		}
		abstract metadata def ConnectorAsUsage : Usage , Connector;
		metadata def ConstraintDefinition : OccurrenceDefinition , Predicate;
		metadata def ConstraintUsage : BooleanExpression , OccurrenceUsage{
			derived ref item constraintDefinition [ 0 .. 1 ] : Predicate :> Metadata::metadataItems :>> predicate;
		}
		abstract metadata def ControlNode : ActionUsage;
		metadata def DecisionNode : ControlNode;
		metadata def Definition : Classifier{
			attribute isVariation [ 1 .. 1 ] : Boolean;
			derived ref item 'variant' [ 0 .. * ] : Usage :> ownedMember :> Metadata::metadataItems;
			derived item variantMembership [ 0 .. * ] : VariantMembership :> ownedMembership :> Metadata::metadataItems;
			derived ref item usage [ 0 .. * ] ordered : Usage :> feature :> Metadata::metadataItems;
			derived ref item directedUsage [ 0 .. * ] ordered : Usage :> directedFeature :> usage :> Metadata::metadataItems;
			derived ref item ownedUsage [ 0 .. * ] ordered : Usage :> ownedFeature :> usage :> Metadata::metadataItems;
			derived ref item ownedReference [ 0 .. * ] ordered : ReferenceUsage :> ownedUsage :> Metadata::metadataItems;
			derived ref item ownedAttribute [ 0 .. * ] ordered : AttributeUsage :> ownedUsage :> Metadata::metadataItems;
			derived ref item ownedEnumeration [ 0 .. * ] ordered : EnumerationUsage :> ownedAttribute :> Metadata::metadataItems;
			derived ref item ownedOccurrence [ 0 .. * ] ordered : OccurrenceUsage :> ownedUsage :> Metadata::metadataItems;
			derived ref item ownedItem [ 0 .. * ] ordered : ItemUsage :> ownedOccurrence :> Metadata::metadataItems;
			derived ref item ownedPart [ 0 .. * ] ordered : PartUsage :> ownedItem :> Metadata::metadataItems;
			derived ref item ownedPort [ 0 .. * ] ordered : PortUsage :> ownedUsage :> Metadata::metadataItems;
			derived ref item ownedConnection [ 0 .. * ] ordered : ConnectorAsUsage :> ownedUsage :> Metadata::metadataItems;
			derived ref item ownedFlow [ 0 .. * ] : FlowUsage :> ownedConnection :> Metadata::metadataItems;
			derived ref item ownedInterface [ 0 .. * ] ordered : InterfaceUsage :> ownedConnection :> Metadata::metadataItems;
			derived ref item ownedAllocation [ 0 .. * ] ordered : AllocationUsage :> ownedConnection :> Metadata::metadataItems;
			derived ref item ownedAction [ 0 .. * ] ordered : ActionUsage :> ownedOccurrence :> Metadata::metadataItems;
			derived ref item ownedState [ 0 .. * ] ordered : StateUsage :> ownedAction :> Metadata::metadataItems;
			derived ref item ownedTransition [ 0 .. * ] : TransitionUsage :> ownedUsage :> Metadata::metadataItems;
			derived ref item ownedCalculation [ 0 .. * ] ordered : CalculationUsage :> ownedAction :> Metadata::metadataItems;
			derived ref item ownedConstraint [ 0 .. * ] ordered : ConstraintUsage :> ownedOccurrence :> Metadata::metadataItems;
			derived ref item ownedRequirement [ 0 .. * ] ordered : RequirementUsage :> ownedConstraint :> Metadata::metadataItems;
			derived ref item ownedConcern [ 0 .. * ] : ConcernUsage :> ownedRequirement :> Metadata::metadataItems;
			derived ref item ownedCase [ 0 .. * ] ordered : CaseUsage :> ownedCalculation :> Metadata::metadataItems;
			derived ref item ownedAnalysisCase [ 0 .. * ] ordered : AnalysisCaseUsage :> ownedCase :> Metadata::metadataItems;
			derived ref item ownedVerificationCase [ 0 .. * ] ordered : VerificationCaseUsage :> ownedCase :> Metadata::metadataItems;
			derived ref item ownedUseCase [ 0 .. * ] ordered : UseCaseUsage :> ownedCase :> Metadata::metadataItems;
			derived ref item ownedView [ 0 .. * ] ordered : ViewUsage :> ownedPart :> Metadata::metadataItems;
			derived ref item ownedViewpoint [ 0 .. * ] ordered : ViewpointUsage :> ownedRequirement :> Metadata::metadataItems;
			derived ref item ownedRendering [ 0 .. * ] ordered : RenderingUsage :> ownedPart :> Metadata::metadataItems;
			derived ref item ownedMetadata [ 0 .. * ] ordered : MetadataUsage :> ownedItem :> Metadata::metadataItems;
		}
		metadata def EnumerationDefinition : AttributeDefinition{
			attribute isVariation [ 1 .. 1 ] : Boolean :>> isVariation;
			derived ref item enumeratedValue [ 0 .. * ] ordered : EnumerationUsage :> Metadata::metadataItems :>> 'variant';
		}
		metadata def EnumerationUsage : AttributeUsage{
			derived ref item enumerationDefinition [ 1 .. 1 ] : EnumerationDefinition :> Metadata::metadataItems :>> attributeDefinition;
		}
		metadata def EventOccurrenceUsage : OccurrenceUsage{
			derived attribute isReference [ 1 .. 1 ] : Boolean :>> isReference;
			derived ref item eventOccurrence [ 1 .. 1 ] : OccurrenceUsage :> Metadata::metadataItems;
		}
		metadata def ExhibitStateUsage : StateUsage , PerformActionUsage{
			derived ref item exhibitedState [ 1 .. 1 ] : StateUsage :> Metadata::metadataItems :>> performedAction;
		}
		abstract metadata def Expose : Import{
			attribute visibility [ 1 .. 1 ] : VisibilityKind :>> visibility;
			attribute isImportAll [ 1 .. 1 ] : Boolean :>> isImportAll;
		}
		metadata def FlowDefinition : Interaction , ActionDefinition{
			derived ref item flowEnd [ 0 .. * ] : Usage :> Metadata::metadataItems :>> associationEnd;
		}
		metadata def FlowUsage : ConnectorAsUsage , Flow , ActionUsage{
			derived ref item flowDefinition [ 0 .. * ] ordered : Interaction :> Metadata::metadataItems :>> actionDefinition :>> interaction;
		}
		metadata def ForLoopActionUsage : LoopActionUsage{
			derived ref item seqArgument [ 1 .. 1 ] : Expression :> Metadata::metadataItems;
			derived ref item loopVariable [ 1 .. 1 ] : ReferenceUsage :> Metadata::metadataItems;
		}
		metadata def ForkNode : ControlNode;
		metadata def FramedConcernMembership : RequirementConstraintMembership{
			attribute kind [ 1 .. 1 ] : RequirementConstraintKind :>> kind;
			derived item ownedConcern [ 1 .. 1 ] : ConcernUsage :> Metadata::metadataItems :>> ownedConstraint;
			derived ref item referencedConcern [ 1 .. 1 ] : ConcernUsage :> Metadata::metadataItems :>> referencedConstraint;
		}
		metadata def IfActionUsage : ActionUsage{
			derived ref item elseAction [ 0 .. 1 ] : ActionUsage :> Metadata::metadataItems;
			derived ref item thenAction [ 1 .. 1 ] : ActionUsage :> Metadata::metadataItems;
			derived ref item ifArgument [ 1 .. 1 ] : Expression :> Metadata::metadataItems;
		}
		metadata def IncludeUseCaseUsage : UseCaseUsage , PerformActionUsage{
			derived ref item useCaseIncluded [ 1 .. 1 ] : UseCaseUsage :> Metadata::metadataItems :>> performedAction;
		}
		metadata def InterfaceDefinition : ConnectionDefinition{
			derived ref item interfaceEnd [ 0 .. * ] ordered : PortUsage :> Metadata::metadataItems :>> connectionEnd;
		}
		metadata def InterfaceUsage : ConnectionUsage{
			derived ref item interfaceDefinition [ 0 .. * ] : InterfaceDefinition :> Metadata::metadataItems :>> connectionDefinition;
		}
		metadata def ItemDefinition : Structure , OccurrenceDefinition;
		metadata def ItemUsage : OccurrenceUsage{
			derived ref item itemDefinition [ 0 .. * ] ordered : Structure :> occurrenceDefinition :> Metadata::metadataItems :> Metadata::metadataItems;
		}
		metadata def JoinNode : ControlNode;
		abstract metadata def LoopActionUsage : ActionUsage{
			derived ref item bodyAction [ 1 .. 1 ] : ActionUsage :> Metadata::metadataItems;
		}
		metadata def MembershipExpose : MembershipImport , Expose;
		metadata def MergeNode : ControlNode;
		metadata def MetadataDefinition : ItemDefinition , Metaclass;
		metadata def MetadataUsage : ItemUsage , MetadataFeature{
			derived ref item metadataDefinition [ 0 .. 1 ] : Metaclass :> Metadata::metadataItems :>> itemDefinition :>> metaclass;
		}
		metadata def NamespaceExpose : Expose , NamespaceImport;
		metadata def ObjectiveMembership : FeatureMembership{
			derived item ownedObjectiveRequirement [ 1 .. 1 ] : RequirementUsage :> Metadata::metadataItems :>> ownedMemberFeature;
		}
		metadata def OccurrenceDefinition : Definition , Class{
			attribute isIndividual [ 1 .. 1 ] : Boolean;
		}
		metadata def OccurrenceUsage : Usage{
			attribute isIndividual [ 1 .. 1 ] : Boolean;
			attribute portionKind [ 0 .. 1 ] : PortionKind;
			derived ref item occurrenceDefinition [ 0 .. * ] ordered : Class :> Metadata::metadataItems :>> definition;
			derived ref item individualDefinition [ 0 .. 1 ] : OccurrenceDefinition :> occurrenceDefinition :> Metadata::metadataItems;
		}
		metadata def PartDefinition : ItemDefinition;
		metadata def PartUsage : ItemUsage{
			derived ref item partDefinition [ 0 .. * ] ordered : PartDefinition :> itemDefinition :> Metadata::metadataItems;
		}
		metadata def PerformActionUsage : ActionUsage , EventOccurrenceUsage{
			derived ref item performedAction [ 1 .. 1 ] : ActionUsage :> Metadata::metadataItems :>> eventOccurrence;
		}
		metadata def PortConjugation : Conjugation{
			ref item originalPortDefinition [ 1 .. 1 ] : PortDefinition :> Metadata::metadataItems :>> originalType;
			derived ref item conjugatedPortDefinition [ 1 .. 1 ] : ConjugatedPortDefinition :> Metadata::metadataItems :>> owningType;
		}
		metadata def PortDefinition : OccurrenceDefinition , Structure{
			derived ref item conjugatedPortDefinition [ 0 .. 1 ] : ConjugatedPortDefinition :> ownedMember :> Metadata::metadataItems;
		}
		metadata def PortUsage : OccurrenceUsage{
			derived ref item portDefinition [ 0 .. * ] ordered : PortDefinition :> Metadata::metadataItems :>> occurrenceDefinition;
		}
		enum def PortionKind{
			'timeslice';
			'snapshot';
		}
		metadata def ReferenceUsage : Usage{
			derived attribute isReference [ 1 .. 1 ] : Boolean :>> isReference;
		}
		metadata def RenderingDefinition : PartDefinition{
			derived ref item 'rendering' [ 0 .. * ] ordered : RenderingUsage :> usage :> Metadata::metadataItems;
		}
		metadata def RenderingUsage : PartUsage{
			derived ref item renderingDefinition [ 0 .. 1 ] : RenderingDefinition :> Metadata::metadataItems :>> partDefinition;
		}
		enum def RequirementConstraintKind{
			assumption;
			'requirement';
		}
		metadata def RequirementConstraintMembership : FeatureMembership{
			attribute kind [ 1 .. 1 ] : RequirementConstraintKind;
			derived item ownedConstraint [ 1 .. 1 ] : ConstraintUsage :> Metadata::metadataItems :>> ownedMemberFeature;
			derived ref item referencedConstraint [ 1 .. 1 ] : ConstraintUsage :> Metadata::metadataItems;
		}
		metadata def RequirementDefinition : ConstraintDefinition{
			attribute reqId [ 0 .. 1 ] : String :>> declaredShortName;
			derived attribute text [ 0 .. * ] : String;
			derived ref item subjectParameter [ 1 .. 1 ] : Usage :> parameter :> usage :> Metadata::metadataItems;
			derived ref item actorParameter [ 0 .. * ] ordered : PartUsage :> parameter :> usage :> Metadata::metadataItems;
			derived ref item stakeholderParameter [ 0 .. * ] ordered : PartUsage :> parameter :> usage :> Metadata::metadataItems;
			derived ref item assumedConstraint [ 0 .. * ] ordered : ConstraintUsage :> ownedFeature :> Metadata::metadataItems;
			derived ref item requiredConstraint [ 0 .. * ] ordered : ConstraintUsage :> ownedFeature :> Metadata::metadataItems;
			derived ref item framedConcern [ 0 .. * ] ordered : ConcernUsage :> requiredConstraint :> Metadata::metadataItems;
		}
		metadata def RequirementUsage : ConstraintUsage{
			attribute reqId [ 0 .. 1 ] : String :>> declaredShortName;
			derived attribute text [ 0 .. * ] : String;
			derived ref item requirementDefinition [ 0 .. 1 ] : RequirementDefinition :> Metadata::metadataItems :>> constraintDefinition;
			derived ref item requiredConstraint [ 0 .. * ] ordered : ConstraintUsage :> ownedFeature :> Metadata::metadataItems;
			derived ref item assumedConstraint [ 0 .. * ] ordered : ConstraintUsage :> ownedFeature :> Metadata::metadataItems;
			derived ref item subjectParameter [ 1 .. 1 ] : Usage :> parameter :> usage :> Metadata::metadataItems;
			derived ref item framedConcern [ 0 .. * ] ordered : ConcernUsage :> requiredConstraint :> Metadata::metadataItems;
			derived ref item actorParameter [ 0 .. * ] ordered : PartUsage :> parameter :> usage :> Metadata::metadataItems;
			derived ref item stakeholderParameter [ 0 .. * ] ordered : PartUsage :> parameter :> usage :> Metadata::metadataItems;
		}
		metadata def RequirementVerificationMembership : RequirementConstraintMembership{
			attribute kind [ 1 .. 1 ] : RequirementConstraintKind :>> kind;
			derived item ownedRequirement [ 1 .. 1 ] : RequirementUsage :> Metadata::metadataItems :>> ownedConstraint;
			derived ref item verifiedRequirement [ 1 .. 1 ] : RequirementUsage :> Metadata::metadataItems :>> referencedConstraint;
		}
		metadata def SatisfyRequirementUsage : RequirementUsage , AssertConstraintUsage{
			derived ref item satisfiedRequirement [ 1 .. 1 ] : RequirementUsage :> Metadata::metadataItems :>> assertedConstraint;
			derived ref item satisfyingFeature [ 1 .. 1 ] : Feature :> Metadata::metadataItems;
		}
		metadata def SendActionUsage : ActionUsage{
			derived ref item receiverArgument [ 0 .. 1 ] : Expression :> Metadata::metadataItems;
			derived ref item payloadArgument [ 1 .. 1 ] : Expression :> Metadata::metadataItems;
			derived ref item senderArgument [ 0 .. 1 ] : Expression :> Metadata::metadataItems;
		}
		metadata def StakeholderMembership : ParameterMembership{
			derived item ownedStakeholderParameter [ 1 .. 1 ] : PartUsage :> Metadata::metadataItems :>> ownedMemberParameter;
		}
		metadata def StateDefinition : ActionDefinition{
			attribute isParallel [ 1 .. 1 ] : Boolean;
			derived ref item 'state' [ 0 .. * ] ordered : StateUsage :> 'action' :> Metadata::metadataItems;
			derived ref item entryAction [ 0 .. 1 ] : ActionUsage :> Metadata::metadataItems;
			derived ref item doAction [ 0 .. 1 ] : ActionUsage :> Metadata::metadataItems;
			derived ref item exitAction [ 0 .. 1 ] : ActionUsage :> Metadata::metadataItems;
		}
		enum def StateSubactionKind{
			'entry';
			'do';
			'exit';
		}
		metadata def StateSubactionMembership : FeatureMembership{
			attribute kind [ 1 .. 1 ] : StateSubactionKind;
			derived item 'action' [ 1 .. 1 ] : ActionUsage :> Metadata::metadataItems :>> ownedMemberFeature;
		}
		metadata def StateUsage : ActionUsage{
			attribute isParallel [ 1 .. 1 ] : Boolean;
			derived ref item stateDefinition [ 0 .. * ] ordered : Behavior :> Metadata::metadataItems :>> actionDefinition;
			derived ref item entryAction [ 0 .. 1 ] : ActionUsage :> Metadata::metadataItems;
			derived ref item doAction [ 0 .. 1 ] : ActionUsage :> Metadata::metadataItems;
			derived ref item exitAction [ 0 .. 1 ] : ActionUsage :> Metadata::metadataItems;
		}
		metadata def SubjectMembership : ParameterMembership{
			derived item ownedSubjectParameter [ 1 .. 1 ] : Usage :> Metadata::metadataItems :>> ownedMemberParameter;
		}
		metadata def SuccessionAsUsage : ConnectorAsUsage , Succession;
		metadata def SuccessionFlowUsage : SuccessionFlow , FlowUsage;
		metadata def TerminateActionUsage : ActionUsage{
			derived ref item terminatedOccurrenceArgument [ 0 .. 1 ] : Expression :> Metadata::metadataItems;
		}
		enum def TransitionFeatureKind{
			trigger;
			guard;
			effect;
		}
		metadata def TransitionFeatureMembership : FeatureMembership{
			attribute kind [ 1 .. 1 ] : TransitionFeatureKind;
			derived item transitionFeature [ 1 .. 1 ] : Step :> Metadata::metadataItems :>> ownedMemberFeature;
		}
		metadata def TransitionUsage : ActionUsage{
			derived ref item source [ 1 .. 1 ] : ActionUsage :> Metadata::metadataItems;
			derived ref item target [ 1 .. 1 ] : ActionUsage :> Metadata::metadataItems;
			derived ref item triggerAction [ 0 .. * ] : AcceptActionUsage :> ownedFeature :> Metadata::metadataItems;
			derived ref item guardExpression [ 0 .. * ] : Expression :> ownedFeature :> Metadata::metadataItems;
			derived ref item effectAction [ 0 .. * ] : ActionUsage :> feature :> Metadata::metadataItems;
			derived ref item 'succession' [ 1 .. 1 ] : Succession :> ownedMember :> Metadata::metadataItems;
		}
		metadata def TriggerInvocationExpression : InvocationExpression{
			attribute kind [ 1 .. 1 ] : TriggerKind;
		}
		enum def TriggerKind{
			'when';
			'at';
			'after';
		}
		metadata def Usage : Feature{
			attribute isVariation [ 1 .. 1 ] : Boolean;
			derived attribute mayTimeVary [ 1 .. 1 ] : Boolean :>> isVariable;
			derived attribute isReference [ 1 .. 1 ] : Boolean;
			derived ref item 'variant' [ 0 .. * ] : Usage :> ownedMember :> Metadata::metadataItems;
			derived item variantMembership [ 0 .. * ] : VariantMembership :> ownedMembership :> Metadata::metadataItems;
			derived ref item owningDefinition [ 0 .. 1 ] : Definition :> owningType :> Metadata::metadataItems;
			derived ref item owningUsage [ 0 .. 1 ] : Usage :> owningType :> Metadata::metadataItems;
			derived ref item definition [ 0 .. * ] ordered : Classifier :> Metadata::metadataItems :>> type;
			derived ref item usage [ 0 .. * ] ordered : Usage :> feature :> Metadata::metadataItems;
			derived ref item directedUsage [ 0 .. * ] ordered : Usage :> directedFeature :> usage :> Metadata::metadataItems;
			derived ref item nestedUsage [ 0 .. * ] ordered : Usage :> ownedFeature :> usage :> Metadata::metadataItems;
			derived ref item nestedReference [ 0 .. * ] ordered : ReferenceUsage :> nestedUsage :> Metadata::metadataItems;
			derived ref item nestedAttribute [ 0 .. * ] ordered : AttributeUsage :> nestedUsage :> Metadata::metadataItems;
			derived ref item nestedEnumeration [ 0 .. * ] ordered : EnumerationUsage :> nestedAttribute :> Metadata::metadataItems;
			derived ref item nestedOccurrence [ 0 .. * ] ordered : OccurrenceUsage :> nestedUsage :> Metadata::metadataItems;
			derived ref item nestedItem [ 0 .. * ] ordered : ItemUsage :> nestedOccurrence :> Metadata::metadataItems;
			derived ref item nestedPart [ 0 .. * ] ordered : PartUsage :> nestedItem :> Metadata::metadataItems;
			derived ref item nestedPort [ 0 .. * ] ordered : PortUsage :> nestedUsage :> Metadata::metadataItems;
			derived ref item nestedConnection [ 0 .. * ] ordered : ConnectorAsUsage :> nestedUsage :> Metadata::metadataItems;
			derived ref item nestedFlow [ 0 .. * ] : FlowUsage :> nestedConnection :> Metadata::metadataItems;
			derived ref item nestedInterface [ 0 .. * ] ordered : InterfaceUsage :> nestedConnection :> Metadata::metadataItems;
			derived ref item nestedAllocation [ 0 .. * ] ordered : AllocationUsage :> nestedConnection :> Metadata::metadataItems;
			derived ref item nestedAction [ 0 .. * ] ordered : ActionUsage :> nestedOccurrence :> Metadata::metadataItems;
			derived ref item nestedState [ 0 .. * ] ordered : StateUsage :> nestedAction :> Metadata::metadataItems;
			derived ref item nestedTransition [ 0 .. * ] : TransitionUsage :> nestedUsage :> Metadata::metadataItems;
			derived ref item nestedCalculation [ 0 .. * ] ordered : CalculationUsage :> nestedAction :> Metadata::metadataItems;
			derived ref item nestedConstraint [ 0 .. * ] ordered : ConstraintUsage :> nestedOccurrence :> Metadata::metadataItems;
			derived ref item nestedRequirement [ 0 .. * ] ordered : RequirementUsage :> nestedConstraint :> Metadata::metadataItems;
			derived ref item nestedConcern [ 0 .. * ] : ConcernUsage :> nestedRequirement :> Metadata::metadataItems;
			derived ref item nestedCase [ 0 .. * ] ordered : CaseUsage :> nestedCalculation :> Metadata::metadataItems;
			derived ref item nestedAnalysisCase [ 0 .. * ] ordered : AnalysisCaseUsage :> nestedCase :> Metadata::metadataItems;
			derived ref item nestedVerificationCase [ 0 .. * ] ordered : VerificationCaseUsage :> nestedCase :> Metadata::metadataItems;
			derived ref item nestedUseCase [ 0 .. * ] ordered : UseCaseUsage :> nestedCase :> Metadata::metadataItems;
			derived ref item nestedView [ 0 .. * ] ordered : ViewUsage :> nestedPart :> Metadata::metadataItems;
			derived ref item nestedViewpoint [ 0 .. * ] ordered : ViewpointUsage :> nestedRequirement :> Metadata::metadataItems;
			derived ref item nestedRendering [ 0 .. * ] ordered : RenderingUsage :> nestedPart :> Metadata::metadataItems;
			derived ref item nestedMetadata [ 0 .. * ] ordered : MetadataUsage :> nestedItem :> Metadata::metadataItems;
		}
		metadata def UseCaseDefinition : CaseDefinition{
			derived ref item includedUseCase [ 0 .. * ] ordered : UseCaseUsage :> Metadata::metadataItems;
		}
		metadata def UseCaseUsage : CaseUsage{
			derived ref item useCaseDefinition [ 0 .. 1 ] : UseCaseDefinition :> Metadata::metadataItems :>> caseDefinition;
			derived ref item includedUseCase [ 0 .. * ] ordered : UseCaseUsage :> Metadata::metadataItems;
		}
		metadata def VariantMembership : OwningMembership{
			derived item ownedVariantUsage [ 1 .. 1 ] : Usage :> Metadata::metadataItems :>> ownedMemberElement;
		}
		metadata def VerificationCaseDefinition : CaseDefinition{
			derived ref item verifiedRequirement [ 0 .. * ] ordered : RequirementUsage :> Metadata::metadataItems;
		}
		metadata def VerificationCaseUsage : CaseUsage{
			derived ref item verificationCaseDefinition [ 0 .. 1 ] : VerificationCaseDefinition :> caseDefinition :> Metadata::metadataItems;
			derived ref item verifiedRequirement [ 0 .. * ] ordered : RequirementUsage :> Metadata::metadataItems;
		}
		metadata def ViewDefinition : PartDefinition{
			derived ref item 'view' [ 0 .. * ] ordered : ViewUsage :> usage :> Metadata::metadataItems;
			derived ref item satisfiedViewpoint [ 0 .. * ] ordered : ViewpointUsage :> ownedRequirement :> Metadata::metadataItems;
			derived ref item viewRendering [ 0 .. 1 ] : RenderingUsage :> Metadata::metadataItems;
			derived ref item viewCondition [ 0 .. * ] ordered : Expression :> ownedMember :> Metadata::metadataItems;
		}
		metadata def ViewRenderingMembership : FeatureMembership{
			derived item ownedRendering [ 1 .. 1 ] : RenderingUsage :> Metadata::metadataItems :>> ownedMemberFeature;
			derived ref item referencedRendering [ 1 .. 1 ] : RenderingUsage :> Metadata::metadataItems;
		}
		metadata def ViewUsage : PartUsage{
			derived ref item viewDefinition [ 0 .. 1 ] : ViewDefinition :> Metadata::metadataItems :>> partDefinition;
			derived ref item satisfiedViewpoint [ 0 .. * ] ordered : ViewpointUsage :> nestedRequirement :> Metadata::metadataItems;
			derived ref item exposedElement [ 0 .. * ] ordered : Element :> member :> Metadata::metadataItems;
			derived ref item viewRendering [ 0 .. 1 ] : RenderingUsage :> Metadata::metadataItems;
			derived ref item viewCondition [ 0 .. * ] ordered : Expression :> ownedMember :> Metadata::metadataItems;
		}
		metadata def ViewpointDefinition : RequirementDefinition{
			derived ref item viewpointStakeholder [ 0 .. * ] ordered : PartUsage :> Metadata::metadataItems;
		}
		metadata def ViewpointUsage : RequirementUsage{
			derived ref item viewpointDefinition [ 0 .. 1 ] : ViewpointDefinition :> Metadata::metadataItems :>> requirementDefinition;
			derived ref item viewpointStakeholder [ 0 .. * ] ordered : PartUsage :> Metadata::metadataItems;
		}
		metadata def WhileLoopActionUsage : LoopActionUsage{
			derived ref item whileArgument [ 1 .. 1 ] : Expression :> Metadata::metadataItems;
			derived ref item untilArgument [ 0 .. 1 ] : Expression :> Metadata::metadataItems;
		}
	}
}
