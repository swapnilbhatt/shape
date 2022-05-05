2D graphics library 

It supports drawing of following 2D objects:

Circle, Triangle, Right Triangle, Equilateral Triangle, Rectangle, Square,
Pentagon, Hexagon, Heptagon, Octagon

It supports drawing and filling objects with colors

To use it

Create instance of the object

`Shape shape = new Circle(new Point(250, 250), 100);`

Just to draw an object
Default border color is black if you want to change
`shape.setDrawColor(Color.RED);`

To Fill an object with the color

`shape.fill();
circle.fill(Color.RED, Color.ORANGE);`

you can set fill color with following

`shape.setFillColor(Color.ORANGE);`
