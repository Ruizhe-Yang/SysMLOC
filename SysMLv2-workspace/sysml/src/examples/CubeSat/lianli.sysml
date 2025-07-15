package lianliCubeSat{
    private import 'Requirement CubeSat'::*;
    private import cubeSatProjects::*;
    
    part lianli1System{
        part lianli1 : CubeSat;
        satisfy CubeSatSystemRequirements by lianli1{
            satisfy 'QB50-SYS-1.1.6' by lianli1;
        }
    }

}