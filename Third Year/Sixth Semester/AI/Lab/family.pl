parent(john,mary).
parent(john,tom).
parent(mary,ann).
parent(mary,bob).
parent(tom,lisa).
male(john).
male(tom).
male(bob).
female(mary).
female(lisa).

mother(X,Y):- parent(X,Y),female(X).
grandfather(X,Y):- parent(X,Z),parent(Z,Y),male(X).
sibling(X,Y):- parent(Z,X),parent(Z,Y),X\=Y.
cousin(X,Y):- sibling(A,B),parent(A,X),parent(B,Y),X\=Y.

