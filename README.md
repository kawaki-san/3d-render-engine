## So, what is it?

A 3D viewer application written in Java (no external dependencies). 

### How does it work?

Using orthographic projection on a shape (in my case, a triangle) with some rasterisation added. Initial vectors are multiplied by a 3x3 Matrix to get the 3D point transformation

#### Lighting?

Flat shading with cross product binary multiplication. Variables being cosine of angle between the two vectors and the color.
## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

## Dependency Management

The `JAVA DEPENDENCIES` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-pack/blob/master/release-notes/v0.9.0.md#work-with-jar-files-directly).
