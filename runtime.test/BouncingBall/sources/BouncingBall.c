/* Main Simulation File */

#if defined(__cplusplus)
extern "C" {
#endif

#include "BouncingBall_model.h"
#include "simulation/solver/events.h"



/* dummy VARINFO and FILEINFO */
const VAR_INFO dummyVAR_INFO = omc_dummyVarInfo;

int BouncingBall_input_function(DATA *data, threadData_t *threadData)
{
  TRACE_PUSH

  
  TRACE_POP
  return 0;
}

int BouncingBall_input_function_init(DATA *data, threadData_t *threadData)
{
  TRACE_PUSH

  
  TRACE_POP
  return 0;
}

int BouncingBall_input_function_updateStartValues(DATA *data, threadData_t *threadData)
{
  TRACE_PUSH

  
  TRACE_POP
  return 0;
}

int BouncingBall_inputNames(DATA *data, char ** names){
  TRACE_PUSH

  
  TRACE_POP
  return 0;
}

int BouncingBall_data_function(DATA *data, threadData_t *threadData)
{
  TRACE_PUSH

  TRACE_POP
  return 0;
}

int BouncingBall_dataReconciliationInputNames(DATA *data, char ** names){
  TRACE_PUSH

  
  TRACE_POP
  return 0;
}

int BouncingBall_dataReconciliationUnmeasuredVariables(DATA *data, char ** names)
{
  TRACE_PUSH

  
  TRACE_POP
  return 0;
}

int BouncingBall_output_function(DATA *data, threadData_t *threadData)
{
  TRACE_PUSH

  
  TRACE_POP
  return 0;
}

int BouncingBall_setc_function(DATA *data, threadData_t *threadData)
{
  TRACE_PUSH

  
  TRACE_POP
  return 0;
}

int BouncingBall_setb_function(DATA *data, threadData_t *threadData)
{
  TRACE_PUSH

  
  TRACE_POP
  return 0;
}


/*
equation index: 6
type: SIMPLE_ASSIGN
$whenCondition1 = h <= 0.0
*/
void BouncingBall_eqFunction_6(DATA *data, threadData_t *threadData)
{
  TRACE_PUSH
  const int equationIndexes[2] = {1,6};
  modelica_boolean tmp0;
  modelica_real tmp1;
  modelica_real tmp2;
  tmp1 = 1.0;
  tmp2 = 0.0;
  relationhysteresis(data, &tmp0, (data->localData[0]->realVars[data->simulationInfo->realVarsIndex[0]] /* h STATE(1,v) */), 0.0, tmp1, tmp2, 0, LessEq, LessEqZC);
  (data->localData[0]->booleanVars[data->simulationInfo->booleanVarsIndex[0]] /* $whenCondition1 DISCRETE */) = tmp0;
  TRACE_POP
}
/*
equation index: 7
type: SIMPLE_ASSIGN
$DER.v = -g
*/
void BouncingBall_eqFunction_7(DATA *data, threadData_t *threadData)
{
  TRACE_PUSH
  const int equationIndexes[2] = {1,7};
  (data->localData[0]->realVars[data->simulationInfo->realVarsIndex[3]] /* der(v) STATE_DER */) = (-(data->simulationInfo->realParameter[1] /* g PARAM */));
  TRACE_POP
}
/*
equation index: 8
type: SIMPLE_ASSIGN
$DER.h = v
*/
void BouncingBall_eqFunction_8(DATA *data, threadData_t *threadData)
{
  TRACE_PUSH
  const int equationIndexes[2] = {1,8};
  (data->localData[0]->realVars[data->simulationInfo->realVarsIndex[2]] /* der(h) STATE_DER */) = (data->localData[0]->realVars[data->simulationInfo->realVarsIndex[1]] /* v STATE(1) */);
  TRACE_POP
}
/*
equation index: 9
type: WHEN

when {$whenCondition1} then
  reinit(v,  (-e) * v);
end when;
*/
void BouncingBall_eqFunction_9(DATA *data, threadData_t *threadData)
{
  TRACE_PUSH
  const int equationIndexes[2] = {1,9};
  if(((data->localData[0]->booleanVars[data->simulationInfo->booleanVarsIndex[0]] /* $whenCondition1 DISCRETE */) && !(data->simulationInfo->booleanVarsPre[0] /* $whenCondition1 DISCRETE */) /* edge */))
  {
    (data->localData[0]->realVars[data->simulationInfo->realVarsIndex[1]] /* v STATE(1) */) = ((-(data->simulationInfo->realParameter[0] /* e PARAM */))) * ((data->localData[0]->realVars[data->simulationInfo->realVarsIndex[1]] /* v STATE(1) */));
    infoStreamPrint(OMC_LOG_EVENTS, 0, "reinit v = %g", (data->localData[0]->realVars[data->simulationInfo->realVarsIndex[1]] /* v STATE(1) */));
    data->simulationInfo->needToIterate = 1;
  }
  TRACE_POP
}

OMC_DISABLE_OPT
int BouncingBall_functionDAE(DATA *data, threadData_t *threadData)
{
  TRACE_PUSH
  int equationIndexes[1] = {0};
#if !defined(OMC_MINIMAL_RUNTIME)
  if (measure_time_flag) rt_tick(SIM_TIMER_DAE);
#endif

  data->simulationInfo->needToIterate = 0;
  data->simulationInfo->discreteCall = 1;
  BouncingBall_functionLocalKnownVars(data, threadData);
  BouncingBall_eqFunction_6(data, threadData);

  BouncingBall_eqFunction_7(data, threadData);

  BouncingBall_eqFunction_8(data, threadData);

  BouncingBall_eqFunction_9(data, threadData);
  data->simulationInfo->discreteCall = 0;
  
#if !defined(OMC_MINIMAL_RUNTIME)
  if (measure_time_flag) rt_accumulate(SIM_TIMER_DAE);
#endif
  TRACE_POP
  return 0;
}


int BouncingBall_functionLocalKnownVars(DATA *data, threadData_t *threadData)
{
  TRACE_PUSH

  
  TRACE_POP
  return 0;
}

/* forwarded equations */
extern void BouncingBall_eqFunction_7(DATA* data, threadData_t *threadData);
extern void BouncingBall_eqFunction_8(DATA* data, threadData_t *threadData);

static void functionODE_system0(DATA *data, threadData_t *threadData)
{
  int id;

  static void (*const eqFunctions[2])(DATA*, threadData_t*) = {
    BouncingBall_eqFunction_7,
    BouncingBall_eqFunction_8
  };
  
  static const int eqIndices[2] = {
    7,
    8
  };
  
  for (id = 0; id < 2; id++) {
    eqFunctions[id](data, threadData);
    threadData->lastEquationSolved = eqIndices[id];
  }
}

int BouncingBall_functionODE(DATA *data, threadData_t *threadData)
{
  TRACE_PUSH
#if !defined(OMC_MINIMAL_RUNTIME)
  if (measure_time_flag) rt_tick(SIM_TIMER_FUNCTION_ODE);
#endif

  
  data->simulationInfo->callStatistics.functionODE++;
  
  BouncingBall_functionLocalKnownVars(data, threadData);
  functionODE_system0(data, threadData);

#if !defined(OMC_MINIMAL_RUNTIME)
  if (measure_time_flag) rt_accumulate(SIM_TIMER_FUNCTION_ODE);
#endif

  TRACE_POP
  return 0;
}

void BouncingBall_computeVarIndices(size_t* realIndex, size_t* integerIndex, size_t* booleanIndex, size_t* stringIndex)
{
  TRACE_PUSH

  size_t i_real = 0;
  size_t i_integer = 0;
  size_t i_boolean = 0;
  size_t i_string = 0;

  realIndex[0] = 0;
  integerIndex[0] = 0;
  booleanIndex[0] = 0;
  stringIndex[0] = 0;

  /* stateVars */
  realIndex[i_real+1] = realIndex[i_real] + ((modelica_integer) 1); i_real++;  /* h STATE(1,v) */realIndex[i_real+1] = realIndex[i_real] + ((modelica_integer) 1); i_real++;  /* v STATE(1) */
  
  /* derivativeVars */
  realIndex[i_real+1] = realIndex[i_real] + ((modelica_integer) 1); i_real++;  /* der(h) STATE_DER */realIndex[i_real+1] = realIndex[i_real] + ((modelica_integer) 1); i_real++;  /* der(v) STATE_DER */
  
  /* algVars */
  
  /* discreteAlgVars */
  
  /* realOptimizeConstraintsVars */
  
  /* realOptimizeFinalConstraintsVars */
  
  
  /* intAlgVars */
  
  /* boolAlgVars */
  booleanIndex[i_boolean+1] = booleanIndex[i_boolean] + ((modelica_integer) 1); i_boolean++;  /* $whenCondition1 DISCRETE */
  
  /* stringAlgVars */
  
  TRACE_POP
}

/* forward the main in the simulation runtime */
extern int _main_SimulationRuntime(int argc, char**argv, DATA *data, threadData_t *threadData);

#include "BouncingBall_12jac.h"
#include "BouncingBall_13opt.h"

struct OpenModelicaGeneratedFunctionCallbacks BouncingBall_callback = {
   NULL,    /* performSimulation */
   NULL,    /* performQSSSimulation */
   NULL,    /* updateContinuousSystem */
   BouncingBall_callExternalObjectDestructors,    /* callExternalObjectDestructors */
   NULL,    /* initialNonLinearSystem */
   NULL,    /* initialLinearSystem */
   NULL,    /* initialMixedSystem */
   #if !defined(OMC_NO_STATESELECTION)
   BouncingBall_initializeStateSets,
   #else
   NULL,
   #endif    /* initializeStateSets */
   BouncingBall_initializeDAEmodeData,
   BouncingBall_computeVarIndices,
   BouncingBall_functionODE,
   BouncingBall_functionAlgebraics,
   BouncingBall_functionDAE,
   BouncingBall_functionLocalKnownVars,
   BouncingBall_input_function,
   BouncingBall_input_function_init,
   BouncingBall_input_function_updateStartValues,
   BouncingBall_data_function,
   BouncingBall_output_function,
   BouncingBall_setc_function,
   BouncingBall_setb_function,
   BouncingBall_function_storeDelayed,
   BouncingBall_function_storeSpatialDistribution,
   BouncingBall_function_initSpatialDistribution,
   BouncingBall_updateBoundVariableAttributes,
   BouncingBall_functionInitialEquations,
   1, /* useHomotopy - 0: local homotopy (equidistant lambda), 1: global homotopy (equidistant lambda), 2: new global homotopy approach (adaptive lambda), 3: new local homotopy approach (adaptive lambda)*/
   NULL,
   BouncingBall_functionRemovedInitialEquations,
   BouncingBall_updateBoundParameters,
   BouncingBall_checkForAsserts,
   BouncingBall_function_ZeroCrossingsEquations,
   BouncingBall_function_ZeroCrossings,
   BouncingBall_function_updateRelations,
   BouncingBall_zeroCrossingDescription,
   BouncingBall_relationDescription,
   BouncingBall_function_initSample,
   BouncingBall_INDEX_JAC_A,
   BouncingBall_INDEX_JAC_B,
   BouncingBall_INDEX_JAC_C,
   BouncingBall_INDEX_JAC_D,
   BouncingBall_INDEX_JAC_F,
   BouncingBall_INDEX_JAC_H,
   BouncingBall_initialAnalyticJacobianA,
   BouncingBall_initialAnalyticJacobianB,
   BouncingBall_initialAnalyticJacobianC,
   BouncingBall_initialAnalyticJacobianD,
   BouncingBall_initialAnalyticJacobianF,
   BouncingBall_initialAnalyticJacobianH,
   BouncingBall_functionJacA_column,
   BouncingBall_functionJacB_column,
   BouncingBall_functionJacC_column,
   BouncingBall_functionJacD_column,
   BouncingBall_functionJacF_column,
   BouncingBall_functionJacH_column,
   BouncingBall_linear_model_frame,
   BouncingBall_linear_model_datarecovery_frame,
   BouncingBall_mayer,
   BouncingBall_lagrange,
   BouncingBall_pickUpBoundsForInputsInOptimization,
   BouncingBall_setInputData,
   BouncingBall_getTimeGrid,
   BouncingBall_symbolicInlineSystem,
   BouncingBall_function_initSynchronous,
   BouncingBall_function_updateSynchronous,
   BouncingBall_function_equationsSynchronous,
   BouncingBall_inputNames,
   BouncingBall_dataReconciliationInputNames,
   BouncingBall_dataReconciliationUnmeasuredVariables,
   BouncingBall_read_simulation_info,
   BouncingBall_read_input_fmu,
   NULL,
   NULL,
   -1,
   NULL,
   NULL,
   -1

};

#define _OMC_LIT_RESOURCE_0_name_data "BouncingBall"
#define _OMC_LIT_RESOURCE_0_dir_data "E:/GitYang/SysMLOC/runtime.test"
static const MMC_DEFSTRINGLIT(_OMC_LIT_RESOURCE_0_name,12,_OMC_LIT_RESOURCE_0_name_data);
static const MMC_DEFSTRINGLIT(_OMC_LIT_RESOURCE_0_dir,31,_OMC_LIT_RESOURCE_0_dir_data);

#define _OMC_LIT_RESOURCE_1_name_data "Complex"
#define _OMC_LIT_RESOURCE_1_dir_data "C:/Users/yangr/AppData/Roaming/.openmodelica/libraries/Complex 4.0.0+maint.om"
static const MMC_DEFSTRINGLIT(_OMC_LIT_RESOURCE_1_name,7,_OMC_LIT_RESOURCE_1_name_data);
static const MMC_DEFSTRINGLIT(_OMC_LIT_RESOURCE_1_dir,77,_OMC_LIT_RESOURCE_1_dir_data);

#define _OMC_LIT_RESOURCE_2_name_data "Modelica"
#define _OMC_LIT_RESOURCE_2_dir_data "C:/Users/yangr/AppData/Roaming/.openmodelica/libraries/Modelica 4.0.0+maint.om"
static const MMC_DEFSTRINGLIT(_OMC_LIT_RESOURCE_2_name,8,_OMC_LIT_RESOURCE_2_name_data);
static const MMC_DEFSTRINGLIT(_OMC_LIT_RESOURCE_2_dir,78,_OMC_LIT_RESOURCE_2_dir_data);

#define _OMC_LIT_RESOURCE_3_name_data "ModelicaServices"
#define _OMC_LIT_RESOURCE_3_dir_data "C:/Users/yangr/AppData/Roaming/.openmodelica/libraries/ModelicaServices 4.0.0+maint.om"
static const MMC_DEFSTRINGLIT(_OMC_LIT_RESOURCE_3_name,16,_OMC_LIT_RESOURCE_3_name_data);
static const MMC_DEFSTRINGLIT(_OMC_LIT_RESOURCE_3_dir,86,_OMC_LIT_RESOURCE_3_dir_data);

static const MMC_DEFSTRUCTLIT(_OMC_LIT_RESOURCES,8,MMC_ARRAY_TAG) {MMC_REFSTRINGLIT(_OMC_LIT_RESOURCE_0_name), MMC_REFSTRINGLIT(_OMC_LIT_RESOURCE_0_dir), MMC_REFSTRINGLIT(_OMC_LIT_RESOURCE_1_name), MMC_REFSTRINGLIT(_OMC_LIT_RESOURCE_1_dir), MMC_REFSTRINGLIT(_OMC_LIT_RESOURCE_2_name), MMC_REFSTRINGLIT(_OMC_LIT_RESOURCE_2_dir), MMC_REFSTRINGLIT(_OMC_LIT_RESOURCE_3_name), MMC_REFSTRINGLIT(_OMC_LIT_RESOURCE_3_dir)}};
void BouncingBall_setupDataStruc(DATA *data, threadData_t *threadData)
{
  assertStreamPrint(threadData,0!=data, "Error while initialize Data");
  threadData->localRoots[LOCAL_ROOT_SIMULATION_DATA] = data;
  data->callback = &BouncingBall_callback;
  OpenModelica_updateUriMapping(threadData, MMC_REFSTRUCTLIT(_OMC_LIT_RESOURCES));
  data->modelData->modelName = "BouncingBall";
  data->modelData->modelFilePrefix = "BouncingBall";
  data->modelData->modelFileName = "BouncingBall.mo";
  data->modelData->resultFileName = NULL;
  data->modelData->modelDir = "E:/GitYang/SysMLOC/runtime.test";
  data->modelData->modelGUID = "{2dcb09bb-8bbd-409c-9951-0e6ae5f39502}";
  data->modelData->initXMLData = NULL;
  data->modelData->modelDataXml.infoXMLData = NULL;
  GC_asprintf(&data->modelData->modelDataXml.fileName, "%s/BouncingBall_info.json", data->modelData->resourcesDir);
  data->modelData->runTestsuite = 0;
  data->modelData->nStates = 2;
  data->modelData->nVariablesRealArray = 4;
  data->modelData->nDiscreteReal = 0;
  data->modelData->nVariablesIntegerArray = 0;
  data->modelData->nVariablesBooleanArray = 1;
  data->modelData->nVariablesStringArray = 0;
  data->modelData->nParametersReal = 2;
  data->modelData->nParametersInteger = 0;
  data->modelData->nParametersBoolean = 0;
  data->modelData->nParametersString = 0;
  data->modelData->nInputVars = 0;
  data->modelData->nOutputVars = 0;
  data->modelData->nAliasReal = 0;
  data->modelData->nAliasInteger = 0;
  data->modelData->nAliasBoolean = 0;
  data->modelData->nAliasString = 0;
  data->modelData->nZeroCrossings = 1;
  data->modelData->nSamples = 0;
  data->modelData->nRelations = 1;
  data->modelData->nMathEvents = 0;
  data->modelData->nExtObjs = 0;
  data->modelData->modelDataXml.modelInfoXmlLength = 0;
  data->modelData->modelDataXml.nFunctions = 0;
  data->modelData->modelDataXml.nProfileBlocks = 0;
  data->modelData->modelDataXml.nEquations = 10;
  data->modelData->nMixedSystems = 0;
  data->modelData->nLinearSystems = 0;
  data->modelData->nNonLinearSystems = 0;
  data->modelData->nStateSets = 0;
  data->modelData->nJacobians = 6;
  data->modelData->nOptimizeConstraints = 0;
  data->modelData->nOptimizeFinalConstraints = 0;
  data->modelData->nDelayExpressions = 0;
  data->modelData->nBaseClocks = 0;
  data->modelData->nSpatialDistributions = 0;
  data->modelData->nSensitivityVars = 0;
  data->modelData->nSensitivityParamVars = 0;
  data->modelData->nSetcVars = 0;
  data->modelData->ndataReconVars = 0;
  data->modelData->nSetbVars = 0;
  data->modelData->nRelatedBoundaryConditions = 0;
  data->modelData->linearizationDumpLanguage = OMC_LINEARIZE_DUMP_LANGUAGE_MODELICA;
}

static int rml_execution_failed()
{
  fflush(NULL);
  fprintf(stderr, "Execution failed!\n");
  fflush(NULL);
  return 1;
}

