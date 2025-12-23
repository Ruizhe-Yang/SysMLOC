class Camera{
	private import ScalarValues :: *;
	portion focusedState : Camera :> timeSlices;
	portion shotState : Camera :> timeSlices;
	succession focusedState then shotState;
}
