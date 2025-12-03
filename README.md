# SysMLOC (SysML v2 Line Of Code)

SysMLOC is an open-source SysML v2 parser rebuilt with Xtext. The name “SysMLOC” comes from “SysML v2 line of code”, reflecting the idea that each EMF model element ideally corresponds to a compact fragment of SysML v2 syntax.

Unlike the original OMG SysML v2 tooling, SysMLOC removes the heavy, complicated linking process and instead stores key fields directly as text, producing a lossless and easy-to-parse EMF model. This design makes it more convenient for EMF engineers to perform richer operations on SysML v2 models, such as text generation, model management, and other advanced tooling workflows (currently under active development).

Eclipse 2024-12
Xtext 2.38.0
