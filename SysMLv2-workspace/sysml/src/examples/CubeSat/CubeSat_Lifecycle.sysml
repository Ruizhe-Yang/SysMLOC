package CubeSat_Lifecycle {

    public import CubeSat_Generic::*;   // 复用结构

    /* 2.1 单阶段动作定义（可进一步细化） */
    abstract action def Phase;

    action def ConceptDevelopment :> Phase;
    action def FundingSecured :> Phase;
    action def MeritFeasibility :> Phase;
    action def Design :> Phase;
    action def ProposalSubmission :> Phase;
    action def SelectionManifesting :> Phase;
    action def MissionCoordination :> Phase;
    action def Licensing :> Phase;
    action def Documentation :> Phase;
    action def GroundSegmentReady :> Phase;
    action def HardwareFabTest :> Phase;
    action def ReadinessReview :> Phase;
    action def CubeSat2Dispenser :> Phase;
    action def Dispenser2LV :> Phase;
    action def Launch :> Phase;
    action def OnOrbitOperations :> Phase;

    /* 2.2 全生命周期主流程 */
    action def CubeSatLifecycle {

    /* 顺序编排——对应 CubeSat 101 16 阶段 */
    action concept : ConceptDevelopment;
    then action funding : FundingSecured;
    then action mfr : MeritFeasibility;
    then action design : Design;
    then action proposal : ProposalSubmission;
    then action select : SelectionManifesting;
    then action coord : MissionCoordination;
    then action license : Licensing;
    then action docs : Documentation;
    then action ground : GroundSegmentReady;
    then action fabtest : HardwareFabTest;
    then action mrr : ReadinessReview;
    then action cube2disp : CubeSat2Dispenser;
    then action disp2lv : Dispenser2LV;
    then action launch : Launch;
    then action ops : OnOrbitOperations;

    /* 应该在每一步之间加入 guard、并行 fork、决策 node 等高阶控制结构 */
    }

    // /* ==== 2.3 轨道段详细流程（示例） ==== */
    // action def OnOrbitOperations {

    // action deploy    { /* ejection + first beacon */ }
    // then action detumble  { /* ADCS 初步稳定 */ }
    // then action commissioning { /* 子系统功能验证 */ }
    // then action nominalOps { /* 任务期间常规运行 */ }
    // then decision endOfLife;
    //     if deorbitRequired then action deorbit;
    //     else action passiveDecay;
    // then done;
    //   }
}
