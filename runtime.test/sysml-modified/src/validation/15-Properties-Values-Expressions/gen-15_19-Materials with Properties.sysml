package '15_19-Materials with Properties'{
	private import ScalarValues::Real;
	private import Quantities :: *;
	private import MeasurementReferences :: *;
	private import SI :: *;
	attribute def AtomicMassValue : MassValue;
	attribute def TensileStrengthUnit : DerivedUnit{
		private attribute lengthPF [ 1 ] : QuantityPowerFactor{
			:>> quantity = isq.L;
			:>> exponent = -1;
		}
		private attribute massPF [ 1 ] : QuantityPowerFactor{
			:>> quantity = isq.M;
			:>> exponent = 1;
		}
		private attribute durationPF [ 1 ] : QuantityPowerFactor{
			:>> quantity = isq.T;
			:>> exponent = -2;
		}
		attribute :>> quantityDimension{
			:>> quantityPowerFactors = (lengthPF, massPF, durationPF);
		}
	}
	attribute def TensileStrengthValue : ScalarQuantityValue{
		attribute : Real :>> num;
		attribute : TensileStrengthUnit :>> mRef;
	}
	attribute < 'N/mm²' > 'newton per square millimetre' : TensileStrengthUnit = N / mm^2;
	part def Substance;
	part def Material : Substance;
	/*
	 * The classification of materials into metals and alloys is grossly simplified and not exhaustive.
	 * A more complete classification would include: ChemicalSubstance, PureMaterial, MixedMaterial,
	 * Class, Ceramic, OrganicMaterial, AnorganicMaterial, Polymer, HybridMaterial, CompositeMaterial,
	 * etc.
	 */
	part def Metal : Material{
		attribute atomicMass [ 1 ] : AtomicMassValue;
	}
	attribute def MaterialFraction{
		ref material [ 1 ] : Material;
		attribute massFraction [ 1 ] : MassFractionValue;
	}
	attribute def MassFractionValue : DimensionOneValue;
	part def Alloy : Material{
		attribute fractions [ 2 .. * ] : MaterialFraction;
	}
	individual def Iron : Metal{
		attribute :>> atomicMass = 55.845 [Da];
	}
	individual def Carbon : Metal{
		attribute atomicMass :>> Metal::atomicMass = 12.011[Da];
	}
	individual def Manganese : Metal{
		attribute atomicMass :>> Metal::atomicMass = 54.938[Da];
	}
	individual def Steel_980 : Alloy{
		/*
		 * Particular example of high tensile strength steel.
		 */
		attribute fraction1 :> fractions{
			ref : Iron :>> material;
			attribute :>> massFraction = 0.9862[one];
		}
		attribute fraction2 :> fractions{
			ref : Carbon :>> material;
			attribute :>> massFraction = 0.9862[one];
		}
		attribute fraction3 :> fractions{
			ref : Manganese :>> material;
			attribute :>> massFraction = 0.9862[one];
		}
		attribute tensileStrength : TensileStrengthValue = 980['N/mm²'];
	}
}
