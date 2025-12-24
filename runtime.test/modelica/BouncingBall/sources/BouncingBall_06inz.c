/* Initialization */
#include "BouncingBall_model.h"
#include "BouncingBall_11mix.h"
#include "BouncingBall_12jac.h"
#if defined(__cplusplus)
extern "C" {
#endif

void BouncingBall_functionInitialEquations_0(DATA *data, threadData_t *threadData);

/*
equation index: 1
type: SIMPLE_ASSIGN
v = $START.v
*/
void BouncingBall_eqFunction_1(DATA *data, threadData_t *threadData)
{
  TRACE_PUSH
  const int equationIndexes[2] = {1,1};
  (data->localData[0]->realVars[data->simulationInfo->realVarsIndex[1]] /* v STATE(1) */) = (data->modelData->realVarsData[1] /* v STATE(1) */).attribute .start;
  TRACE_POP
}
extern void BouncingBall_eqFunction_8(DATA *data, threadData_t *threadData);

extern void BouncingBall_eqFunction_7(DATA *data, threadData_t *threadData);


/*
equation index: 4
type: SIMPLE_ASSIGN
h = $START.h
*/
void BouncingBall_eqFunction_4(DATA *data, threadData_t *threadData)
{
  TRACE_PUSH
  const int equationIndexes[2] = {1,4};
  (data->localData[0]->realVars[data->simulationInfo->realVarsIndex[0]] /* h STATE(1,v) */) = (data->modelData->realVarsData[0] /* h STATE(1,v) */).attribute .start;
  TRACE_POP
}
extern void BouncingBall_eqFunction_6(DATA *data, threadData_t *threadData);

OMC_DISABLE_OPT
void BouncingBall_functionInitialEquations_0(DATA *data, threadData_t *threadData)
{
  TRACE_PUSH
  BouncingBall_eqFunction_1(data, threadData);
  BouncingBall_eqFunction_8(data, threadData);
  BouncingBall_eqFunction_7(data, threadData);
  BouncingBall_eqFunction_4(data, threadData);
  BouncingBall_eqFunction_6(data, threadData);
  TRACE_POP
}

int BouncingBall_functionInitialEquations(DATA *data, threadData_t *threadData)
{
  TRACE_PUSH

  data->simulationInfo->discreteCall = 1;
  BouncingBall_functionInitialEquations_0(data, threadData);
  data->simulationInfo->discreteCall = 0;
  
  TRACE_POP
  return 0;
}

/* No BouncingBall_functionInitialEquations_lambda0 function */

int BouncingBall_functionRemovedInitialEquations(DATA *data, threadData_t *threadData)
{
  TRACE_PUSH
  const int *equationIndexes = NULL;
  double res = 0.0;

  
  TRACE_POP
  return 0;
}


#if defined(__cplusplus)
}
#endif

