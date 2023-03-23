## Inspiration: 

In the status quo, mental health issues are one of the most pressing problems that high schoolers tend to face. Unfortunately, many of these high schoolers either don’t have the resources necessary, or don’t feel comfortable enough to open up about their mental health, so they never get a proper diagnosis. But with this tool Ryan and I have created, you can input what your loved ones have been saying, and put it through our sentiment analysis, to have the best non-formal look at how they actually may be feeling (Anxious, stressed, sad, enthusiastic, love, etc.). Using that information you can help seek proper medical care. For this hackathon we wanted to create a project that helps our peers, and we know many of our peers who don’t feel comfortable enough to talk about their mental health, so using this tool, we can perform an informal diagnosis, and help them get the help they need.

## What it does: 
This project takes in social media posts as inputs, and returns a diagnostic which assesses how bad or good a person is feeling (mentally) based on several factors relating to the posts. Think of it as an informal mental health diagnosis. The output will show how, most likely, they’ve been feeling these past few weeks, using that information you can take the steps necessary to help them get the medical attention they need!

## How we built it: 
This project can be divided into two tasks: nlp task (classifying a social media post as either positive, neutral, or negative), and analyzing the results of the nlp task. Currently dominating the field of natural language processing are transformers, a powerful, and memory-heavy technology capable of representing text in meaningful embeddings. We can use these models to classify the social media posts into the three categories. The pretrained transformer model we used was trained on 57 million social media posts, and functioned as a crucial aspect of our own model. The problem with using the pretrained model directly is that it isn’t specialized for our own task. As an analogy, most cars will get you across a road in icy conditions, but a car equipped with winter tires will do it efficiently. We need to fine tune the pretrained model (equipping it with winter tires) so that it’s weights can be better calibrated towards our task. As direct evidence of this need, the pretrained model by itself achieves 61 percent validation accuracy. However, after fine tuning, it jumps to 70 percent accuracy! Once we achieve a solid model, we are able to analyze the results, predictions, and probability predictions (which can be used as confidence levels) to create an appropriate diagnostic. 


## Challenges we ran into
The primary problem with extremely large models, like transformers, is that the training phase can be tedious, and very difficult to obtain good results from. For instance, changing how aggressively the model should learn by 1e-5, can change the model's accuracy from 50 percent to 60.
Another problematic issue we faced was data quality. For the first half of this experience, we used a different sentiment analysis dataset to train our model.  However, after closely examining the dataset, we realized that the text content was completely incoherent, making it impossible for a model to learn. 

## Accomplishments that we're proud of
Strong Base Task Performance (70% validation accuracy)
Accurate Diagnostic Generation 
Clean Display Of Results
## What we learned
Training transformers is an extremely finicky process, and requires lots of patience, focus, and coffee! Analyze and personally examine the dataset to make sure that it is logical, clean, and coherent. Don’t blindly trust that it is quality! Since the first time around, we didn’t personally examine the dataset, and the quality ended up being very poor, so we had to find another dataset and train using that, with the limited time we had left over.
## What's next for this project
Our goal and hope for the future of this project, is to eventually put it into a website/app so people can use nice gui, instead of a python output cell! Other than just that, we want this to be something people frequently use, because if they’re able to perform informal diagnoses on themselves or their loved ones, this can be the first step in the right direction for them to eventually get help for their mental health. So having greater marketing surrounding this potential app or website, could truly be beneficial for our peers and your loved ones.


## HOW TO RUN THIS ON YOU'RE OWN DEVICE:
1. DON'T run the training notebook! The point of that notebook is to generate the file in the TrainedTransformerModelFile folder. Because it has already been generated, we don't need to rerun it. If you want to though, you NEED to connect to a gpu. If you are on cpu, like most laptops, it will finish in a few years (barely kidding). 
2. To run the product file succesfully: put the file in the same directory as the model file and open the code file in an editor of you're choice (vscode). Change the line of code that says: model.load_state_dict(torch.load("../input/sentimentanalysisfinetunedmodel/SentimentClassifierEpoch1.pth")) to model.load_state_dict(torch.load(the path to the model file on you're device)). To enter you're own posts follow the instructions that display after the final line is executed. Note that for this code, a gpu isn't needed because the amount of data being processed is significantly lower. 
