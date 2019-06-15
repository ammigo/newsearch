import React, {Component} from 'react';
import {Route} from 'react-router-dom';
import NewsPage from './pages/Newspage';

class App extends Component {
    render() {
        return (
            <React.Fragment>
                <Route path="/:category?" component={NewsPage}/>
            </React.Fragment>
        );
    }
}

export default App;
