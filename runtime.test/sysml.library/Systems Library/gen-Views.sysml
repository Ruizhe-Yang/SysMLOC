standard library package Views{
	doc /*
	 * This package defines the base types for views, viewpoints, renderings and related elements 
	 * in the SysML language.
	 */
	private import Parts::Part;
	private import Parts::parts;
	private import Requirements::RequirementCheck;
	private import Requirements::requirementChecks;
	abstract view def View : Part{
		ref view : View :>> self;
		abstract ref view subviews [ 0 .. * ] : View :> views{
			doc /*
    		 * Other Views that are used in the rendering of this View.
    		 */
		}
		abstract ref rendering viewRendering [ 0 .. 1 ] : Rendering{
			doc /*
			 * The rendering of this View.
			 */
		}
		viewpoint viewpointSatisfactions [ 0 .. * ] : ViewpointCheck :> viewpointChecks :> checkedConstraints{
			doc /*
			 * Checks that the View satisfies all required ViewpointUsages.
			 */
		}
		satisfy requirement viewpointConformance by that{
			doc /*
			 * An assertion that all viewpointSatisfactions are true.
			 */
			require viewpointSatisfactions{
				doc /*
				 * The required ViewpointChecks.
				 */
				ref :>> ownedPerformances::this :>> subperformances::this default that.that;
			}
		}
	}
	abstract viewpoint def ViewpointCheck : RequirementCheck{
		doc /*
		 * ViewpointCheck is a RequirementCheck for checking if a View meets the concerns of viewpoint stakeholders. 
		 * It is the base type of all ViewpointDefinitions.
		 */
		ref viewpoint : ViewpointCheck :>> self;
		subject subj [ 1 ] : View :>> RequirementCheck::subj;
	}
	abstract rendering def Rendering : Part{
		doc /*
		 * Rendering is the base type of all RenderingDefinitions.
		 */
		ref rendering : Rendering :>> self;
		abstract ref rendering subrenderings [ 0 .. * ] : Rendering :> renderings{
			doc /*
			 * Other Renderings used to carry out this Rendering.
			 */
		}
	}
	rendering def TextualRendering : Rendering{
		doc /*
		 * A TextualRendering is a Rendering of a View into a textual format.
		 */
	}
	rendering def GraphicalRendering : Rendering{
		doc /*
		 * A GraphicalRendering is a Rendering of a View into a Graphical format.
		 */
	}
	rendering def TabularRendering : Rendering{
		doc /*
		 * A TabularRendering is a Rendering of a View into a tabular format.
		 */
	}
	abstract view views [ 0 .. * ] nonunique : View :> parts{
		doc /*
		 * views is the base feature of all ViewUsages.
		 */
	}
	abstract viewpoint viewpointChecks [ 0 .. * ] nonunique : ViewpointCheck :> requirementChecks{
		doc /*
		 * viewpointChecks is the base feature of all ViewpointUsages.
		 */
	}
	abstract rendering renderings [ 0 .. * ] nonunique : Rendering :> parts{
		doc /*
		 * renderings is the base feature of all RenderingUsages.
		 */
	}
	rendering asTextualNotation [ 1 ] : TextualRendering :> renderings{
		doc /*
		 * asTextualNotation renders a View into textual notation as defined in the 
		 * KerML and SysML specifications.
		 */
	}
	rendering asTreeDiagram [ 1 ] : GraphicalRendering :> renderings{
		doc /*
		 * asTreeDiagram renders a View as a tree diagram, using the 
		 * graphical notation defined in the SysML specification.
		 */
	}
	rendering asInterconnectionDiagram [ 1 ] : GraphicalRendering :> renderings{
		doc /*
		 * asInterconnectionDiagram renders a View as an interconnection 
		 * diagram, using the graphical notation defined in the SysML specification.
		 */
	}
	rendering asElementTable [ 1 ] : TabularRendering :> renderings{
		doc /*
		 * asElementTable  renders a View as a table, with one row for each exposed 
		 * Element and columns rendered by applying the columnViews in order to the
		 * Element in each row.
		 */
		view columnView [ 0 .. * ] ordered{
			doc /*
			 * The Views to be rendered in the column cells, in order, of each rows of the table.
			 */
			abstract ref rendering [ 0 .. 1 ] :>> viewRendering;
		}
		rendering [ 0 .. * ] :>> subrenderings = columnView.viewRendering;
	}
}
