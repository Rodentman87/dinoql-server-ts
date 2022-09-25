grammar DinoQL;

document: definition+;

definition: scalarDefinition | interfaceDefinition | resourceDefinition | enumDefinition;

scalarDefinition: 'scalar' ID ID ';';

enumDefinition: DOC_COMMENT? 'enum' ID '{' ID (',' ID)* '}';

interfaceDefinition: DOC_COMMENT? 'interface' ID '{' propertyDefinition+ '}';

resourceDefinition: DOC_COMMENT? STATIC? 'resource' ID '{' (propertyDefinition | queryDefinition | actionDefinition)+ '}';

// Member definitions
propertyDefinition: DOC_COMMENT? IDENTIFIER? ID OPTIONAL? ':' value ';';

queryDefinition: DOC_COMMENT? STATIC? 'query' ID parameterListDefinition ':' value ';';

actionDefinition: DOC_COMMENT? STATIC? 'action' ID parameterListDefinition ':' value ';';

parameterListDefinition: '()'
	| '(' parameterDefinition ')'
	| '(' (parameterDefinition ',')+ parameterDefinition ')';

parameterDefinition: DOC_COMMENT? ID OPTIONAL? ':' value;

value: 
	ARRAY_START ID ARRAY_END OPTIONAL?
	| ID OPTIONAL?;

// tokens
STATIC: 'static';
ID: [a-zA-Z_][a-zA-Z0-9_-]*;
WS: [ \t\r\n]+ -> skip;
OPTIONAL: '?';
IDENTIFIER: '#';
ARRAY_START: '[';
ARRAY_END: ']';
DOC_START: '/*';
DOC_COMMENT: DOC_START (.*?) DOC_END;
DOC_END: '*/';