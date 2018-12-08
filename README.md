# Smart XML analyzer
## Description
It helps you find the XML path of any given element contained a certain reference HTML file in another HTML file, which may differ from the reference file.
## How to use
It should be executed form the command line like this:
```
> scala ae-exercise-assembly-0.1.jar <reference_file_path> <another_file_path> <element_id>
```
Where:

`reference_file_path` is the path to the file where the element can be easily found with the `element_id`

`another_file_path` is the path where you want to search for the element

`element_id` is the id of the element you want to search for (in the reference file)

## Examples
```
> scala ae-exercise-assembly-0.1.jar Examples/sample-0-origin.html Examples/sample-1-evil-gemini.html make-everything-ok-button
html > body > div > div > div > div > div > div > a
```
```
> scala ae-exercise-assembly-0.1.jar Examples/sample-0-origin.html Examples/sample-2-container-and-clone.html make-everything-ok-button
html > body > div > div > div > div > div > div > div > a
```
```
> scala ae-exercise-assembly-0.1.jar Examples/sample-0-origin.html Examples/sample-3-the-escape.html make-everything-ok-button
html > body > div > div > div > div > div > div > a
```
```
> scala ae-exercise-assembly-0.1.jar Examples/sample-0-origin.html Examples/sample-4-the-mash.html make-everything-ok-button
html > body > div > div > div > div > div > div > a
```
