import React from 'react';
import ReactDOM from 'react-dom';

// Import necessary libraries
// Render the portfolio component to the DOM
ReactDOM.render(<Portfolio />, document.getElementById('root'));
// Generate a random number between 1 and 10
const randomNumber = Math.floor(Math.random() * 10) + 1;

// Define an array of different portfolio sections
const portfolioSections = [
    {
        title: 'Section 1',
        description: 'This is section 1 of my portfolio.',
        projects: [
            {
                title: 'Project 1',
                description: 'This is project 1 in section 1.',
            },
            {
                title: 'Project 2',
                description: 'This is project 2 in section 1.',
            },
        ],
    },
    {
        title: 'Section 2',
        description: 'This is section 2 of my portfolio.',
        projects: [
            {
                title: 'Project 3',
                description: 'This is project 3 in section 2.',
            },
            {
                title: 'Project 4',
                description: 'This is project 4 in section 2.',
            },
        ],
    },
    // Add more sections as needed
];

// Get a random portfolio section based on the generated number
const randomSection = portfolioSections[randomNumber - 1];

// Remove the duplicate definition of the 'Portfolio' component
// Define the main component for your portfolio
const Portfolio = () => {
    return (
        <div>
            <h1>Welcome to My Portfolio</h1>
            <p>Here, I showcase my skills in a professional Harry Potter style.</p>
            <h2>{randomSection.title}</h2>
            <p>{randomSection.description}</p>
            {/* Render the projects in the random section */}
            {randomSection.projects.map((project, index) => (
                <div key={index}>
                    <h3>{project.title}</h3>
                    <p>{project.description}</p>
                </div>
            ))}
        </div>
    );
};

// Render the portfolio component to the DOM
ReactDOM.render(<Portfolio />, document.getElementById('root'));
